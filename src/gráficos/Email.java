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

	public void cambioDePropiedadesDeCorreo() 
        {
		String emailPort = "587";
		propiedadesDelEmail = System.getProperties();
		propiedadesDelEmail.put("mail.smtp.port", emailPort);
		propiedadesDelEmail.put("mail.smtp.auth", "true");
		propiedadesDelEmail.put("mail.smtp.starttls.enable", "true");
	}
        

	public void email() throws AddressException,
			MessagingException {
                MimeMultipart multiParte = new MimeMultipart();
		String[] toEmails = { "andrespato1@gmail.com" };
		String emailSubject = "Bank";
                BodyPart texto = new MimeBodyPart();
                texto.setText("Banco pura birra y nada de guaro");
                BodyPart adjunto = new MimeBodyPart();
                adjunto.setDataHandler(new DataHandler(new FileDataSource("/home/andres/20061220034317!Stop_hand.png")));
                adjunto.setFileName("20061220034317!Stop_hand.png");
                
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
