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
        
    String nomeCompleto = "Maria Camargo de Souza";
    int sub1 = nomeCompleto.indexOf(" ");
    String primeiroNome= nomeCompleto.substring(0, sub1);
    System.out.println(primeiroNome);
        
    int sub2 = nomeCompleto.lastIndexOf(" ");       
    String ultimoNome = nomeCompleto.substring(sub2+1, nomeCompleto.length());
    
    System.out.println(ultimoNome);
    
    
    
    
        
    
        
        
    }
}
