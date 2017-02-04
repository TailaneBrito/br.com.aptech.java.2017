/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classes.California;
import classes.NovaIorque;
import classes.Texas;

/**
 *
 * @author tailaneb
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 10. Crie a Classe Eua que é mãe das Classes NovaIorque, Texas e 
         * Califórnia. Criar o método verificarIdade() na Classe Eua em que 
         * mostra maior de idade se for maior que 18 e menor de idade se for 
         * menor que 18 anos. Na Califórnia, a maioridade é acima de 16 anos. 
         * Criar na Classe Eua um método abstrato timeDaCasa() que mostra em um 
         * sout o nome do time de futebol americano do estado correspondente.
         * Criar a interface LeiPenaDeMorte com o método penaDeMorte que retorna
         * true ou false (método do tipo boolean). A Classe Texas é a única que 
         * contrata essa interface. Criar a classe Main chamando todos os 
         * métodos possíveis. (2.0)
         */
        
        California c = new California();
        c.verificarIdade(16);
        c.timeDaCasa();
        System.out.println(" ");
        
        NovaIorque n = new NovaIorque();
        n.verificarIdade(18);
        n.timeDaCasa();
        System.out.println(" ");
        
        Texas t = new Texas();
        t.verificarIdade(18);
        t.timeDaCasa();
        t.penaDeMorte();
    }
}
