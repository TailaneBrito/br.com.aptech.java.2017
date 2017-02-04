/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStream is = new FileInputStream("src\\arquivos\\exemplo.txt");
        
        //Lendo arquivos em binario
        byte[] binario = new byte[is.available()];
        is.read(binario);
        
        
        //Convertendo para texto
        String texto = new String(binario,"UTF-8");
        System.out.println("No arquivo tem: " + texto);
        is.close();
        
        
    }
}
