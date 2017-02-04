/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author Aluno
 */
public abstract class Animal {
    
    //nao abstrato
    public void dormir(){
        System.out.println("Zzzz");
    }
    
    //abstrato
    public abstract void cacar();
    
}
