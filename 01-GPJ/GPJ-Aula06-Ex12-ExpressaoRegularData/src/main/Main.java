/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
//        double resp = 0;
//        int cont=0, num=0;
        
        String data = "08/pp/2016";
       /**
        * Padrao dois numeros / dois numeros / quatro numeros
        */
        String padrao = "^[0-9]{2}/[0-9]{2}/[0-9]{4}$";
        
        //criou o padrao
        Pattern p = Pattern.compile(padrao);
        //verifica se esta no padrao
        Matcher m = p.matcher(data);
        
        if(m.find()){
            System.out.println("Está no padrão");
        }else{
            System.out.println("Fora do padrão");
        }
        
        
//        
//            for (double i = 1; i <= 2000; i++) {
//            for (double j = 1; j <= i; j++) {
//                resp = i % j;
//                if (resp == 0) {
//                    cont++;
//                    num = cont;
//                }
//            }
//            if (num == 2) {
//                System.out.println(i + " it's prime");
//            }
////            } else {
////                //remove this else to show only prime numbers
////                System.out.println(i + " it isn't prime");
////            }
//            cont = 0;
//            }

    }
    
}
