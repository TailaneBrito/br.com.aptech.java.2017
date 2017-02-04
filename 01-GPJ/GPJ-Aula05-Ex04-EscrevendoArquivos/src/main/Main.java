/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File arq = new File("src\\arquivos\\exemplo.txt");
        boolean arquivo = arq.canExecute();
        System.out.println("Criou o arquivo? " + arquivo);
        
        OutputStream fos = new FileOutputStream("src\\arquivos\\exemplo.txt");
        String frase = "Escrevendo2 no arquivo Frase exemplo 123";
        fos.write(frase.getBytes());
        fos.flush();
        fos.close();
        

        //Abrindo o arquivo escrito anteriormente e lendo ele
        InputStream is = new FileInputStream("src\\arquivos\\exemplo.txt");
        
        //Ler arquivos em binario
        //o arquivo existe?
        byte[] b = new byte[is.available()];
        //entao leia o arquivo
        is.read(b);
        
        //convertendo para texto
        String texto = new String(b,"UTF-8");
        System.out.println("Conteúdo do arquivo: \n" + texto);
        is.close();
        
        
        
    }
}
