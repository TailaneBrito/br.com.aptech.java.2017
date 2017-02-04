/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import eletronicos.Computador;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {

        Computador cpu = new Computador();
        cpu.setValor(3000);
        cpu.setMarca("HP");
        cpu.setAno(2001);

        System.out.println("Marca....: " + cpu.getMarca());
        System.out.println("Valor....: " + cpu.getValor());
        System.out.println("Ano......: " + cpu.getAno());

    }
}
