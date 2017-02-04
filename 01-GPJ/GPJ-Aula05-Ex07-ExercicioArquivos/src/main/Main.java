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
        
        String caminho1 = "src\\criandoArquivosDiretorio\\cidades";
        String caminho2 = "src\\criandoArquivosDiretorio\\paises";
        
        File pasta1 = new File(caminho1);
        File pasta2 = new File(caminho2);
        
        boolean p1 = pasta1.mkdir();
        boolean p2 = pasta2.mkdir();
        
        System.out.println("===CRIANDO PASTAS== \n " + caminho1 + "\n " + caminho2);
        
        //Criando arquivos na pasta 1
        File p1ar1 = new File(caminho1+"\\cidades_sudeste.txt");
        boolean a1p1 = p1ar1.createNewFile();
        File p1ar2 = new File(caminho1+"\\cidades_nordeste.xls");
        boolean a2p1 = p1ar2.createNewFile();
        File p1ar3 = new File(caminho1+"\\cidades_norte.doc");
        boolean a3p1 = p1ar3.createNewFile();
        
        System.out.println("Pasta 1. \n" + pasta1.list().length + " arquivos");
               
        

        //Criando arquivos na pasta 2
        File p2ar1 = new File(caminho2+"\\paises_europeus.ppt");
        boolean a1p2 = p2ar1.createNewFile();
        File p2ar2 = new File(caminho2+"\\paises_asiaticos.pdf");
        boolean a2p2 = p2ar2.createNewFile();
        
        System.out.println("Pasta 2. \n" + pasta2.list().length + " arquivos");
        
        //Renomear
        File arqNovo1 = new File(caminho1+"\\cidades_sul.txt");
        p1ar1.renameTo(arqNovo1);
        File arqNovo2 = new File(caminho2+"\\paises_africanos.ppt");
        p2ar1.renameTo(arqNovo2);
        
        System.out.println("===RENOMEAR===");
        System.out.println("Renomeado " + p1ar1.toString() + "\n para " + arqNovo1);
        System.out.println("Renomeado " + p2ar1.toString() + "\n para " + arqNovo2);
        
        
        
        
        
        //Deletar arquivos
        System.out.println("===Deletando arquivos===");
        p2ar2.delete();
        p1ar3.delete();
        
        //Listando conteúdo das pastas
        System.out.println("Pasta 1. " + pasta1.list().length + " arquivos");
        System.out.println("Pasta 2. " + pasta2.list().length + " arquivos");
        
        
        
        
        
        
        
        
        
                

    }
}
