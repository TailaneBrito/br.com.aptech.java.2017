/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import importacao.Brasil;
import importacao.China;
import importacao.EUA;
import importacao.Franca;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {

        Brasil br = new Brasil();
        China ch = new China();
        EUA eua = new EUA();
        Franca fc = new Franca();
        
        System.out.println("Para um produto de $100,00");
        
        System.out.println("Brasil Exportacao " + br.taxaExportacao(100));
        System.out.println("Brasil Importacao " + br.taxaImportacao(100) + "\n");
        
        System.out.println("China Exportacao " + ch.taxaExportacao(100));
        System.out.println("China Importacao " + ch.taxaImportacao(100) + "\n");
        
        System.out.println("Franca Exportacao " + fc.taxaExportacao(100));
        System.out.println("Franca Importacao " + fc.taxaImportacao(100) + "\n");
        
        System.out.println("EUA Exportacao " + eua.taxaExportacao(100));
        System.out.println("EUA Importacao " + eua.taxaImportacao(100) + "\n");
        
        

    }

}
