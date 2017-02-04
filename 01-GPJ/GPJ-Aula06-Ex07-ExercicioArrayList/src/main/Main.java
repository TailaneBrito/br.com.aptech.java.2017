/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        ArrayList saladaDeFrutas = new ArrayList();
        saladaDeFrutas.add("Morango");
        saladaDeFrutas.add("Laranja");
        saladaDeFrutas.add("Abacaxi");
        saladaDeFrutas.add("Mamão");
        saladaDeFrutas.add("Kiwi");
        saladaDeFrutas.add("Banana");
        
        System.out.println("Tamanho do array: \n" 
                + saladaDeFrutas.size());
        System.out.println("Monstrando itens: ");
        for (int i = 0; i < saladaDeFrutas.size(); i++) {
            System.out.println(i + "." + saladaDeFrutas.get(i));
                                  
        }
        
        //mostrando elemento na posicao 3
        System.out.println("Mostrando " + saladaDeFrutas.get(3));
        
        //mostrando posicao
        System.out.println("Posicao de Kiwi: " + saladaDeFrutas.indexOf("Kiwi"));
        
        System.out.println("Removendo Laranja: " + saladaDeFrutas.remove("Laranja"));
        System.out.println("Removendo Banana: " + saladaDeFrutas.remove("Banana"));
        
        System.out.println("Atualizando o elemento 0 \n para Cereja " 
                + saladaDeFrutas.set(0, "Cereja"));
        
        System.out.println("Listando de novo");
        for (int i = 0; i < saladaDeFrutas.size(); i++) {
            System.out.println(i + "." + saladaDeFrutas.get(i));
                                  
        }
        
        System.out.println("Atualizar o elemento de índice "
                + "\n Mamao para Limao " 
                + saladaDeFrutas.set(2, "Limão"));
        
        System.out.println("Exibir todos os elementos");
        for (int i = 0; i < saladaDeFrutas.size(); i++) {
            System.out.println(i + "." + saladaDeFrutas.get(i));
                                  
        }
        
        
    }
}
