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

public class Email {

	Properties propiedadesDelEmail;
	Session sessionUsuarioEmail;
	MimeMessage mensaje;
        String rutaImagen = "";
        baseDeDatos hora = new baseDeDatos(); 

	public void cambioDePropiedadesDeCorreo() 
        {
		String emailPort = "587";
		propiedadesDelEmail = System.getProperties();
		propiedadesDelEmail.put("mail.smtp.port", emailPort);
		propiedadesDelEmail.put("mail.smtp.auth", "true");
		propiedadesDelEmail.put("mail.smtp.starttls.enable", "true");
	}
        

	public void email(String email, String mensaj) throws AddressException,
			MessagingException {
                MimeMultipart multiParte = new MimeMultipart();
		String[] toEmails = { email };
		String emailSubject = "Bank";
                BodyPart texto = new MimeBodyPart();
                texto.setText(mensaj+hora.getHora());
                BodyPart adjunto = new MimeBodyPart();
                adjunto.setDataHandler(new DataHandler(new FileDataSource(rutaImagen)));
                adjunto.setFileName("Bleach-Wallpapers-bleach-manga-and-tv-11523378-1680-1050.jpg");
                
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
