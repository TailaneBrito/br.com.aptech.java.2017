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
      String caminho = "src\\arquivos\\exemplo.txt"  ;
      String caminhoPasta = "src\\arquivos";
      File arquivo = new File(caminho);
      File arquivo2 = new File(caminhoPasta);
      
      
        System.out.println("Existe " + arquivo.exists());
       
    }
}
