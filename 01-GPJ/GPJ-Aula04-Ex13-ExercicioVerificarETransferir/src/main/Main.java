/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        
    
    File pasta1 = new File("C:\\Users\\Aluno.adm-PC\\Desktop\\pasta1\\");
    
    
    Scanner leitor = new Scanner(System.in);
    
        System.out.println("Digite o nome do arquivo");
        String arq = leitor.nextLine();
        
    File nomeArquivo =  new File (pasta1+"\\"+arq+".txt");
        
        if(nomeArquivo.exists()){
            System.out.println("já existe, pasta 2");
            String caminho2 = "C:\\Users\\Aluno.adm-PC\\Desktop\\pasta2\\"+arq+".txt";
            File pasta2 = new File(caminho2);
            nomeArquivo.renameTo(pasta2);  
        }else{
            System.out.println("Arquivo nao existe");
        }
        
        
    }
}
