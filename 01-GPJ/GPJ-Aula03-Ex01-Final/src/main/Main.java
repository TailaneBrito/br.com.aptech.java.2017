/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import matematica.Matematica;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Matematica m = new Matematica();
        Matematica m1 = new Matematica();
        
        System.out.println("varival final PI: " + m.PI);    
        
        m.variavelx = 50;
        System.out.println("Valor da variavelx m: " + m.variavelx);
        System.out.println("Valor da variavalx m1: " + m1.variavelx);
    }
}
