/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import empresa.*;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Funcionario f3 = new Funcionario();
        
        Funcionario.nomeEmpresa = "Google";
        System.out.println("Empresa " + Funcionario.nomeEmpresa + "\n");
        
        f1.nome = "Roberto";
        f1.idade = 32;
        f1.nomeEmpresa = "Emp1";
        
        f2.nome = "Miranda";
        f2.idade = 45;
        f2.nomeEmpresa = "Emp2";
        
        f3.nome = "Carla";
        f3.idade = 23;
        f3.nomeEmpresa = "Emp7";
        
        
        
        System.out.println(
                        "Funcionario 1: " + f1.nome + "\n"
                      + "Idade........: " + f1.idade + "\n"
                      + "Empresa......: " + f1.nomeEmpresa + "\n");
        
         System.out.println(
                        "Funcionario 2: " + f2.nome + "\n"
                      + "Idade........: " + f2.idade + "\n"
                      + "Empresa......: " + f2.nomeEmpresa + "\n");
         
          System.out.println(
                        "Funcionario 3: " + f3.nome + "\n"
                      + "Idade........: " + f3.idade + "\n"
                      + "Empresa......: " + f3.nomeEmpresa);
    }
}
