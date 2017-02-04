/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Iterator;
import static java.util.Spliterators.iterator;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        
        lista.add("Tailane");
        lista.add("Felipe");
        lista.add("Fátima");
        lista.add("Tatiane");
        lista.add("Joana");
        
        Iterator iter1 = lista.iterator();
        
        //Exibindo valores de um Array
        while(iter1.hasNext()){
            System.out.println(iter1.next());
        }
        
    }
 
}
