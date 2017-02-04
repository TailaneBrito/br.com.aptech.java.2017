/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("Agora certo " + d);
        System.out.println("Agora errado " + d.getTime() + " quantos milessegundos deste 1970");
        
        
        //Convertendo para outro formato
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String d2 = formato.format(d);
        System.out.println("Agora formatado " + d2);
    }
}
