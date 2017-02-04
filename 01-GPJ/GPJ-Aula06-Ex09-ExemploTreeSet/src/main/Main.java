/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        /**
         * No exemplo percebe-se que houve ordenacao crescente dos elementos
         * eliminando os repetidos.
         */
        TreeSet lista1 = new TreeSet();
        
        lista1.add("Amanda");
        lista1.add("Larissa");
        lista1.add("André");
        lista1.add("Marcio");
        lista1.add("Kelvin");
        lista1.add("Bruno");
        lista1.add("André");
        lista1.add("Kelvin");
        
        Iterator iter1 = lista1.iterator();
        while(iter1.hasNext()){
            System.out.println(iter1.next());
        }
        
        System.out.println("QTD elementos: " + lista1.size());
     
        
    }
 
}
