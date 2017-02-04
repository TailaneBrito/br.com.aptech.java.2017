/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File folder = new File("src\\exemplo\\");
        boolean criarFolder = folder.mkdir();
        System.out.println("Criou a pasta? " + criarFolder);
        
        File arq = new File("src\\exemplo\\arq.txt");
        boolean criarArq = arq.createNewFile();
        System.out.println("Criou o arquivo? " + criarArq);
       
    }
}
