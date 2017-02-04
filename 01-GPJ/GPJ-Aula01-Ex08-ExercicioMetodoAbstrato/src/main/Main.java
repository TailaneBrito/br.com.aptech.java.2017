/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import func.Adm;
import func.Financeiro;
import func.TI;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {

        Adm a1 = new Adm();
        a1.horasTrabalhadas();
        a1.trabalha();
        System.out.println(" ");

        TI t1 = new TI();
        t1.horasTrabalhadas();
        t1.trabalha();
        System.out.println(" ");

        Financeiro f1 = new Financeiro();
        f1.horasTrabalhadas();
        f1.trabalha();
        System.out.println(" ");

    }
}
