/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pais;

/**
 *
 * @author Aluno
 */
public abstract class Brasil {
   
    public abstract double impostoLuz(double valor);
    
    public double descontoGas(double valor){
        return valor - (valor*0.1);
    }
    
}
