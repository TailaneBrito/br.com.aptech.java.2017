/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {
        
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro ");
        double num1 = leitor.nextInt();
        
        System.out.println("Digite outro numero");
        double num2 = leitor.nextInt();
        
        double maior = Math.max(num1, num2);
        System.out.println("O maior numero informado foi " + maior);
        
        double menor = Math.min(num1, num2);
        System.out.println("O menor numero informado foi " + menor);
        
        double raizQuadrada = Math.sqrt(menor);
        System.out.println("Raiz quadrada de " + menor + " é " + raizQuadrada);
        
        double potencia = Math.pow(maior, 3);
        System.out.println(maior + " elevado à 3 é " + potencia);
        
        
        
    }
}
