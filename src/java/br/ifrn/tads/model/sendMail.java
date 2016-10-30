package br.ifrn.tads.model;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class sendMail {

    public void enviar(String remetente, String senha, String destinatario, 
            String assunto, String corpo) {
        final String username = remetente;
        final String password = senha;

        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.host", "smtp.live.com");
        props.put("mail.smtp.socketFactory.port", "587");
        props.put("mail.smtp.socketFactory.fallback", "false");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(remetente));
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(remetente));
            message.setSubject(assunto);
            message.setText(corpo);

            Transport.send(message);

            System.out.println("Tudo certo");

        } 

        catch (MessagingException e) 
        {            
            System.out.println("erro de autenticação, saindo!");
        }
    } 
 
}