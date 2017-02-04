/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import animal.Cachorro;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        
    Cachorro c1 = new Cachorro();
    c1.idade = 3;
    int valor = 12;
    c1.verificadorIdade(valor);
    
    }
}
