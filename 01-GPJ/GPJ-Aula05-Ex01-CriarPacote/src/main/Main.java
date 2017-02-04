/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        
    
    File pasta = new File("src\\exemplo");
    boolean criardir = pasta.mkdir();
    
        System.out.println(criardir);
    }
}
