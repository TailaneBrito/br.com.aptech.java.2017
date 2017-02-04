/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import veiculos.Aereo;
import veiculos.Aquatico;
import veiculos.Terrestre;
import veiculos.Veiculos;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Veiculos v1 = new Veiculos();
            Terrestre t1 = new Terrestre();
            Aquatico a1 = new Aquatico();
            Aereo ar1 = new Aereo();
            
            System.out.println("** Veiculos");
                   
            
            System.out.println("** Terrestre");
            t1.cor = "Azul";
            t1.marca = "Ford";
            t1.preco = 20000;
            t1.correr();
            
            System.out.println("** Aquatico");
            a1.cor = "Vermelho";
            a1.marca = "Ford";
            a1.preco = 20000;
            System.out.println(a1.cor + " " + a1.marca + " " + a1.preco);
            a1.nadar();
            
            System.out.println("** Aereo");
            ar1.cor = "Rosa";
            ar1.marca = "Ford";
            ar1.preco = 20000;
            System.out.println(ar1.cor + " " + ar1.marca + " " + ar1.preco);
            ar1.voar();
    }
}
