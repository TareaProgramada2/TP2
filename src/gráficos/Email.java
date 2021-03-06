/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gráficos;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import gráficos.baseDeDatos;
import java.io.IOException;

public class Email {
    /**
     * atributos de la clase email
     */

	Properties propiedadesDelEmail;
	Session sessionUsuarioEmail;
	MimeMessage mensaje;
        baseDeDatos BD = new baseDeDatos(); 

         /**
        * da nuevas propierdades al web service de gmail 
        */
	public void cambioDePropiedadesDeCorreo() 
        {
		String emailPort = "587";
		propiedadesDelEmail = System.getProperties();
		propiedadesDelEmail.put("mail.smtp.port", emailPort);
		propiedadesDelEmail.put("mail.smtp.auth", "true");
		propiedadesDelEmail.put("mail.smtp.starttls.enable", "true");
	}
        

        /**
        *  rellena los datos del email para ser enviado
        */

	public void email(String email,String banco, String mensaj) throws AddressException,
			MessagingException,
			IOException {
                BD.leerFicherosNombreLogo();
                BD.listaNombreLogo();
                String logo,rut;
                logo= BD.getLogo();
                rut = BD.getRutLogo();
                MimeMultipart multiParte = new MimeMultipart();
		String[] toEmails = { email };
		String emailSubject = banco;
                BodyPart texto = new MimeBodyPart();
                texto.setText(mensaj+BD.getHora());
                BodyPart adjunto = new MimeBodyPart();
                adjunto.setDataHandler(new DataHandler(new FileDataSource(rut)));
                adjunto.setFileName(logo);

                
                multiParte.addBodyPart(texto);
                multiParte.addBodyPart(adjunto);


		sessionUsuarioEmail = Session.getDefaultInstance(propiedadesDelEmail, null);
		mensaje = new MimeMessage(sessionUsuarioEmail);

		for (int i = 0; i < toEmails.length; i++) {
			mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmails[i]));
		}

		mensaje.setSubject(emailSubject);
		mensaje.setContent(multiParte);
              
		

	}
        
        /**
        * segun un correo establecido se se envia el email con los atributos de los metodos anteriores 
        */
	public void enviarEmail() throws AddressException, MessagingException {                
		String emailHost = "smtp.gmail.com";
		String fromUser = "carnitasbrown";
		String fromUserEmailPassword = "carnitas12345";

		Transport transport = sessionUsuarioEmail.getTransport("smtp");

		transport.connect(emailHost, fromUser, fromUserEmailPassword);
		transport.sendMessage(mensaje, mensaje.getAllRecipients());
		transport.close();
		System.out.println("Email enviado");
	}

}
