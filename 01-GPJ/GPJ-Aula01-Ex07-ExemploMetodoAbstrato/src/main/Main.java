/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import animais.Cachorro;
import animais.Gato;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        
    Cachorro c = new Cachorro();
    Gato g = new Gato();
    
        System.out.println("Cachorro");
        c.cacar();
        c.dormir();
        
        System.out.println("Gato");
        g.cacar();
        g.dormir();
    
    }
}
