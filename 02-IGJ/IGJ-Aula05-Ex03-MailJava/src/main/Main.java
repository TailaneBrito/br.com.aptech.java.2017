/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author ADM004
 */
public class Main {
    
    public void enviarEmail(String assunto, String remetente,
            String para, String mensagem){
    
    
    };
    
    
    //copia do documento que esta no pacote doc.
    public static void main(String[] args) throws AddressException, MessagingException, UnsupportedEncodingException {
        //esta configurado para enviar para o GMAIL
        
        
        String assunto="[APTECH JAVA] Teste Java Mail";
        String remetente = "Tailane";
        String para = "tailane.brito01@gmail.com";
        String mensagem = "Oi, Tai. Esse email é apenas um teste. Obrigada :)";
        
        Session mailSession = null;
        Properties props = null;
        Message message = null;
        
        String smtp = "smtp.gmail.com";
        
        props = new Properties();
        props.put("mail.smtp.host", smtp);
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.debug", "true");
        
        mailSession = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication("tailane.brito01@gmail.com", "rim01ido");
            }
        });
        System.out.println("Conectou com o email!!");
        
        Address de = new InternetAddress("tailane.brito01@gmail.com",remetente);
        Address[] para2 = InternetAddress.parse(para);
        message = new MimeMessage(mailSession);
        message.setFrom(de);
        message.setRecipients(Message.RecipientType.TO, para2);
        message.setSubject(assunto);
        message.setText(mensagem);
        
        System.out.println("Carregando para enviar.");
        Transport.send(message);
        System.out.println("Enviou o email!");
    }
}
