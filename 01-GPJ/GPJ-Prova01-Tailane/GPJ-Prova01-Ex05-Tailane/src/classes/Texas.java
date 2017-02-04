/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.ILeiPenaDeMorte;

/**
 *
 * @author tailaneb
 */
public class Texas extends EUA implements ILeiPenaDeMorte{
    
    public Texas(){
        System.out.println("Texas");
    }

    @Override
    public void timeDaCasa() {
        System.out.println("TIME DA CASA : Houston Texans");

    }

    @Override
    public boolean penaDeMorte() {
        return true;
    }
    
}
