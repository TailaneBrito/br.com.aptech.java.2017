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
        
    String telefone= "(11)98201-2329";
    String sub1 = telefone.replace("(", "");
    String sub2 = sub1.replace(")", "");
    String sub3 = sub2.replace("-", "");
    
    String sub4 = sub2.substring(0, 2); //dd
    System.out.println("Telefone " + sub3);
    System.out.println("DD " + sub4);
    
    if(sub3.length()==10){
        System.out.println("Fixo");
    }else if(sub3.length()==11){
        System.out.println("Celular");
    }else{
        System.out.println("Indefinido");
    }
    
    
    
    
    
    }
    
}
