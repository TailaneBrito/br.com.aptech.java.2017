/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Converter String para Double
         */
        
        String valor = "123";
        double conv = Double.valueOf(valor);
        double conv2 = Double.parseDouble(valor);
        float conv3 = Float.valueOf(valor);
        int conv4 = Integer.valueOf(valor);
        long conv5 = Long.valueOf(valor);
        
        /**
         * Converter qualquer coisa para String
         */
        int numero = 33333;
        String conv6 = ""+numero;
        String conv7 = String.valueOf(conv);
        
        //Exemplo
        System.out.printf("o valor em float é %7.2f",conv3);
    }
}
