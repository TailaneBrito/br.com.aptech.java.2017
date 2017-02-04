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
        ArrayList array = new ArrayList();
        
        long cpf = 4429917825l;
        
        array.add(21);
        array.add("Tailane");
        array.add(1.57);
        array.add(50.00);
        array.add(cpf);
        
        System.out.println("Quantidade de elementos: \n " + array.size() + "\n");
        System.out.println("Elementos do array \n " + array + "\n");
        
        //Mostrando de 1 ao tamanho do array, todos os elementos dentro dele
        
        
        
        for (int i = 1; i < array.size(); i++) {
            System.out.println(i+". " + array.get(i));
        }
        
        System.out.println("\n Mostrando o cpf " + array.get(4));
        
    }
}
