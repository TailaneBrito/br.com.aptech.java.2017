/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armas;

/**
 *
 * @author Aluno
 */
public class PistolasAutomatica extends Pistolas {
    public PistolasAutomatica(){
        System.out.println(" ");
        System.out.println("PistolasAutomaticas");
    }
    
    @Override
    public void descricao(){
        super.descricao();
        System.out.println("Trio.....: automático");
        System.out.println("Dobro do preco");
        
    
    }
}
