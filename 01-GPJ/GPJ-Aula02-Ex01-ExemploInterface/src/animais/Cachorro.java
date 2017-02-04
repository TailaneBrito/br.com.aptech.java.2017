/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

import interfaces.ICaninos;
import interfaces.IMamiferos;

/**
 *
 * @author Aluno
 */
public class Cachorro extends Animal implements ICaninos,IMamiferos{
    public Cachorro(){
        System.out.println(" ");
        System.out.println("Cachorro");
    }
    
    @Override
    public void latir() {
        System.out.println("Au Au");
    }

    @Override
    public void uivar() {
        System.out.println("Auuuuuuuuuu");
    }

    @Override
    public void mamar() {
        System.out.println("Mamando~");
    }

    
    
}
