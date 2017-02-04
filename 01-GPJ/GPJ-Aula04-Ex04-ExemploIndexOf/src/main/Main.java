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
        String frase = "Hoje é Sábado";
        String trocar = frase.replace("Hoje","Amanhã");
        
        int posicao = frase.indexOf("é");
        int tamanho = frase.length();
        
        System.out.println("Frase...: " + frase);
        System.out.println("Trocar..: " + trocar);
        System.out.println("Posicao.: " + posicao);
        System.out.println("Tamanho.: " + tamanho + " caracteres");
    }
}
