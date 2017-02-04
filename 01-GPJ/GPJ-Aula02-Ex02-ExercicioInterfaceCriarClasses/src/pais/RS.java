/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pais;

import interfaces.IRegiaoSul;

/**
 *
 * @author Aluno
 */
public class RS extends Brasil implements IRegiaoSul{
    public RS(){
        System.out.println(" ");
        System.out.println("Rio Grande do Sul");
    
    }
    
    @Override
    public double impostoLuz(double valor) {
        return valor + 45;
    }

    @Override
    public void comidaTipica() {
        System.out.println("Arroz de Carreteiro");
    }

    @Override
    public void dancaTipica() {
        System.out.println("Pau-de-Fitas");
    }
    
}
