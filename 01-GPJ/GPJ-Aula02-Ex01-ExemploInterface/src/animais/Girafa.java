/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

import interfaces.IMamiferos;

/**
 *
 * @author Aluno
 */
public class Girafa extends Animal implements IMamiferos{
    public Girafa(){
        System.out.println(" ");
        System.out.println("Girafa");
    
    }
    @Override
    public void mamar() {
        System.out.println("Mamandoooo~");
    }
    
}
