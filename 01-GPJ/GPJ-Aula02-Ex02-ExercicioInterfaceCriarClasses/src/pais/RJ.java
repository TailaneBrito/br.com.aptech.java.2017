/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pais;

import interfaces.IRegiaoSudeste;

/**
 *
 * @author Aluno
 */
public class RJ extends Brasil implements IRegiaoSudeste{

    public RJ() {
        System.out.println(" ");
        System.out.println("Rio de Janeiro");
    }
    
    @Override
    public double impostoLuz(double valor) {
        return valor + 75;
    }

    @Override
    public void festaTipica() {
        System.out.println("Carnaval Rio");
    }
    
}
