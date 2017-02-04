/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import familia.Filho1;
import familia.Filho2;
import familia.Filho3;
import familia.Pai;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Pai p1 = new Pai();
            Filho1 f1 = new Filho1();
            Filho2 f2 = new Filho2();
            Filho3 f3 = new Filho3();
            
            System.out.println("Pai");
            p1.cantar();
            p1.dancar();
            System.out.println(" ");
            
            System.out.println("Filho 1");
            f1.cantar();
            f1.dancar();
            System.out.println(" ");
            
            System.out.println("Filho 2");
            f2.cantar();
            f2.dancar();
            System.out.println(" ");
            
            System.out.println("Filho 3");
            f3.cantar();
            f3.dancar();
            
    }
}
