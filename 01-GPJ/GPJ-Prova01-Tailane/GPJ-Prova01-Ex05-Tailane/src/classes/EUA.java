/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author tailaneb
 */
public abstract class EUA {
    
    public void verificarIdade(int idade){
        if(idade >= 18){
            System.out.println("Maior de Idade " + idade + " anos ");
        }else{
            System.out.println("Menor de Idade");
        }
        
    }
    
    public abstract void timeDaCasa();
}
