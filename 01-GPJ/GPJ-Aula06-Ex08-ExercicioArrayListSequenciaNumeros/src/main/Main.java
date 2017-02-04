/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        ArrayList seqnum = new ArrayList();
        
        for (int i = 1; i <= 1000; i++) {
            if(i%2!=0){
                seqnum.add(i);
            }
        }
        
        Iterator it = seqnum.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
    }
}
