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
        
        SimpleDateFormat formato = new SimpleDateFormat("kk");
        String d2 = formato.format(d);
        System.out.println("Hora do Sistema " + d2);
        
        int hora = 5; //Integer.valueOf(d2);
        
        if(hora >= 6 && hora < 12 ){
            System.out.println("Bom dia!");
        }else if(hora <= 18 ){
            System.out.println("Boa tarde!");
        }else{
            System.out.println("Boa noite!");
        }
        
        
    }
}
