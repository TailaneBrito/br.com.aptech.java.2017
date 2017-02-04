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
public class SP extends Brasil implements IRegiaoSudeste {

    public SP() {
        System.out.println(" ");
        System.out.println("São Paulo");
    }
    
    
    
    @Override
    public double impostoLuz(double valor) {
        return valor + 50;
    }
    
    @Override
    public double descontoGas(double valor){
        return valor - (valor*0.05) ;
    }

    @Override
    public void festaTipica() {
        System.out.println("Carnaval SP");
    }
    
    
}
