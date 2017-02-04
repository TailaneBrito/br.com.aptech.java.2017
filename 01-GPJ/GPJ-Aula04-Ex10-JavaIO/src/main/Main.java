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
        
        File arquivo = new File("C:\\Users\\Aluno.adm-PC\\Desktop\\exemploJava\\exemplo.txt");
        File arquivo2 = new File("C:\\Users\\Aluno.adm-PC\\Desktop\\exemploJava\\");
        
        if(arquivo.exists()){
            System.out.println("Arquivo existe");
            System.out.println("É um arquivo? " + arquivo.isFile());
            System.out.println("É uma pasta? " + arquivo.isDirectory());
            System.out.println("Quantidade de arquivos? " + arquivo2.length());
        }else{
            System.out.println("Nao existe");
        }
    }
}
