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
       
    Scanner leitor1 = new Scanner(System.in); 
    Scanner leitor2 = new Scanner(System.in);
    Scanner leitor3 = new Scanner(System.in);
       
    System.out.println("Digite a pasta de origem");
    String origem = leitor1.nextLine();    
    
    System.out.println("Digite a pasta de destino");
    String destino = leitor2.nextLine();
    
    System.out.println("Digite o nome do aquivo");
    String arq = leitor3.nextLine();
    
    String caminhoOrigem = "src\\"+origem+"\\"+arq+".txt";
    File nomeArquivo = new File(caminhoOrigem);
    
    String caminhoDestino = "src\\"+destino+"\\"+arq+".txt";
    File nomeArquivo2 = new File(caminhoDestino);
        
    if(nomeArquivo.exists()){
        System.out.println("Nome arquivo Existe");
        nomeArquivo.renameTo(nomeArquivo2);
    }else{
        System.out.println("Nao existe");
    }
    
    
    
    
    }
}
