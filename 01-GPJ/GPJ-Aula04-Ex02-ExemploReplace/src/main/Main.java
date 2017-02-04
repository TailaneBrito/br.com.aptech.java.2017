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
        
    String frase = "Batatinha quando nasce...nascendo";
    String fraseNova;
    fraseNova = frase.replace("nasce", "morre");
    
    System.out.println(fraseNova);
    
    String frase2;
    frase2 = fraseNova.replaceAll(" ", "_");
    System.out.println(frase2);
            
    }
}
