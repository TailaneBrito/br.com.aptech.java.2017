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
public class California extends EUA {
    
    public California(){
        System.out.println("California");
    }

    @Override
    public void verificarIdade(int idade) {
        if (idade >= 16) {
            System.out.println("Maior de Idade " + idade + " anos");
        }else{
            System.out.println("Menor de idade");
        }
    }

    @Override
    public void timeDaCasa() {
        System.out.println("TIME DA CASA : Southern California Seahorses");
    }
    
}
