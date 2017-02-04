/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        /**
         * Usuário vai informar data de nascimento e 
         * vamos informar que dia que cai.
         */
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite: \n Data de nascimento ex: dd/MM/yyyy: ");
        String dataNasc = leitor.nextLine();
        
        SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
        
        Date data = d.parse(dataNasc);
        
        SimpleDateFormat diaSemana = new SimpleDateFormat("EEEE");
        
        String dataConv = diaSemana.format(data);
        
        System.out.println("Você Nasceu: \n Dia da semana " + dataConv);
        
    }
}
