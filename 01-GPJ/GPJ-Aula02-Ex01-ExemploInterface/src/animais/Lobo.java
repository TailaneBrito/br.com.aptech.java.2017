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
public class Lobo extends Animal implements ICaninos, IMamiferos{
    public Lobo(){
        System.out.println(" ");
        System.out.println("Lobo");
    
    }
    
    
    
    @Override
    public void mamar() {
        System.out.println("Mamandoooooouuu");
    }

    @Override
    public void latir() {
        System.out.println("Auuu Auuuu");
    }

    @Override
    public void uivar() {
        System.out.println("Auuuuuuuuuuuuuuuu~");
    }
    
}
