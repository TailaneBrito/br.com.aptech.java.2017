/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import corretor.*;
/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Comecou a corrida!");
        Corredor1 c1 = new Corredor1();
        Corredor2 c2 = new Corredor2();
        
        c1.start();
        c2.start();
        
    }
}
