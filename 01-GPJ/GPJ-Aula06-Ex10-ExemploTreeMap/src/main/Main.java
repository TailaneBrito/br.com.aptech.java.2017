/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.TreeMap;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        
    
    TreeMap mapa1 = new TreeMap();
    
             //chave, valor 
    mapa1.put("João", "Java");
    mapa1.put("Maria", "Banco de dados");
    mapa1.put("José","Lógica");
    mapa1.put("Marta", "Calculo");
    
    //pegando o valor da chave
    String valor = (String) mapa1.get("José");
        System.out.println("Valor em José: " + valor );
    }
}
