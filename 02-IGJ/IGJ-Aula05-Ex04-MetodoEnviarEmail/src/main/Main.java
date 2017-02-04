/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import emailutil.EmailUtil;
import java.io.UnsupportedEncodingException;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) throws MessagingException, AddressException, UnsupportedEncodingException {
        EmailUtil email = new EmailUtil();
        email.enviarEmail("Teste 02", "tailane.brito01@gmail.com", 
                "tailane.brito01@gmail.com", "essa mensagem é um teste");
    }
}
