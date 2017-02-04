/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        /**
         * SABER QUANTOS DIAS FALTAM PARA O SEU ANIVERSARIO
         */
        
        //dia do aniversario
        String dataAniv = "08/10/2016";
        String anoQueVem = "12/10/2016";
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date diaAniv = formato.parse(dataAniv);
       
        Date anoSeguinte = formato.parse(anoQueVem);
        
        //dirando os segundos
        long diferenca = (anoSeguinte.getTime() - diaAniv.getTime());
        
        long dias = diferenca/(24*60*60*1000);
        System.out.println("Faltam " + dias + " dias ");
        
        
        
        
        
        
    }
}
