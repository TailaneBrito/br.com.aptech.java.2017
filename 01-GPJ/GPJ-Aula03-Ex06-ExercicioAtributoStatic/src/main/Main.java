/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import pessoa.*;
/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Pessoa homem = new Pessoa();
        Pessoa mulher = new Pessoa();
        
        System.out.println("Conta Conjunta " + Pessoa.contaConjunta);
        System.out.println("Homem Carteira " + (homem.carteira = 100));
        System.out.println("Mulher Carteira " + (mulher.carteira = 100));
        
        
        System.out.println("Homem Deposita " );
        homem.deposita(50);
        
        System.out.println("Mulher Deposita " );
        mulher.deposita(50);
        
        System.out.println("Conta conjunta " + Pessoa.contaConjunta);
        
        
        System.out.println("Homem saca");
        homem.saca(80);
        
        System.out.println("Conta conjunta " + Pessoa.contaConjunta);
        
        System.out.println("\n Exemplo ");
        System.out.println("Carteira homem " + homem.carteira);
        System.out.println("Carteira mulher " + mulher.carteira);
        System.out.println("Conta conjunta homem " + homem.contaConjunta);
        System.out.println("Conta conjunta mulher " + mulher.contaConjunta);
        
    }
}
