/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classes.TrabalharComArquivos;
import java.io.IOException;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) throws IOException {
        
        TrabalharComArquivos ta = new TrabalharComArquivos();
        ta.criarArquivo("src\\contador\\contador.txt");
               
    }
}
