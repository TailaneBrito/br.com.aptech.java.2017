/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pais;

import interfaces.IRegiaoNordeste;

/**
 *
 * @author Aluno
 */
public class BA extends Brasil implements IRegiaoNordeste{
    public BA(){
        System.out.println(" ");
        System.out.println("Bahia");
    
    }
    
    
    @Override
    public double impostoLuz(double valor) {
        return valor + 30;
    }

    @Override
    public void comidaMaisVendida() {
        System.out.println("Acarajé");
    }
}
