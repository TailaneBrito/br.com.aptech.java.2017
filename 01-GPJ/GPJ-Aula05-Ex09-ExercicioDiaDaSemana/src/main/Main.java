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
        //PEGA O DIA DA SEMANA
        
        Date d = new Date();
        System.out.println(d);
        
        SimpleDateFormat formato = new SimpleDateFormat("EEEE");
        String d2 = formato.format(d);
        System.out.println("Dia da semana: " + d2);
        
        
        
    }
}
