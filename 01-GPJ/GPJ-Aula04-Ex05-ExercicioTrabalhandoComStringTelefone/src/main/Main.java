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
        //padrao telefone (11)99999-9999 celular   
        //padrao telefone (11)9999-9999  fixo
        
        String numeroTelefone=   "(11)9999-9999";
        
        System.out.println(numeroTelefone.indexOf("-"));
        
        
        if(numeroTelefone.length() == 13){
            System.out.println("Fixo");
        }else{
            System.out.println("Celular");
        }
            
        
        
        
        
        
        
    }
}
