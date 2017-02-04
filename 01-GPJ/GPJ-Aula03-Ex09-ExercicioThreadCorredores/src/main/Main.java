/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import corredores.*;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Comecou a corrida!");
    Corredor1 c1 = new Corredor1();
    Corredor2 c2 = new Corredor2();
    Corredor3 c3 = new Corredor3();
    Corredor4 c4 = new Corredor4();
    
    
    
    c1.start();
    c2.start();
    c3.start();
    c4.start();
   
    }
}
