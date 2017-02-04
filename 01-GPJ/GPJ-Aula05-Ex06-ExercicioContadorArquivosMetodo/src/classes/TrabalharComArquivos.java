/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

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
public class TrabalharComArquivos {
    String  caminho;
    
    
    public void criarArquivo(String caminho) throws IOException{
        this.caminho = caminho;
        File arq = new File(this.caminho);
        boolean arqCriado = arq.createNewFile();
    
        InputStream is = new FileInputStream(this.caminho);
        
        //o arquivo existe?
        byte[] b = new byte[is.available()];
        //entao leia o arquivo
        is.read(b);
       
    
        //convertendo para texto
        String texto = new String(b,"UTF-8");
        System.out.println("Conteúdo do arquivo: \n" + texto);
        
        int valor = Integer.valueOf(texto);
        
        valor++;
        
        String texto2 = String.valueOf(valor);
        
        //String caminho2 = "src\\exemplo\\contador.txt \n";
        OutputStream fos = new FileOutputStream(caminho);
        
        String frase = texto2;
        fos.write(frase.getBytes());
        fos.flush();
        fos.close(); 
    
    }
      
}
