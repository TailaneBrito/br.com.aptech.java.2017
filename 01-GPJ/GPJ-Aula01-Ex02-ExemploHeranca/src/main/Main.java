/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import animais.Animal;
import animais.Cachorro;
import animais.Gato;
import animais.Mamifero;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
    Animal a1 = new Animal();
    
        Mamifero m1 = new Mamifero();
        Gato g1 = new Gato();
        Cachorro c1 = new Cachorro();
        
        System.out.println("Animal");
        a1.respirar();
        
        System.out.println("Mamifero");
        m1.mamar();
        
        System.out.println("Cachorro");
        c1.respirar();
        c1.mamar();
        
        System.out.println("Gato");
        g1.respirar();
        g1.mamar();
        
        System.out.println("Gato");
        g1.respirar();
        g1.mamar();
        

                
    }
}
