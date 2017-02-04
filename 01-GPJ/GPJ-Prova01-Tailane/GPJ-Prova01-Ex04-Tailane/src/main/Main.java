/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import lutador.Lutador;

/**
 *
 * @author tailaneb
 */
public class Main {

    public static void main(String[] args) {
        /**
         * 9. Crie a Classe Lutador que tenha os métodos combo1(), combo2(),
         * combo3(), soco() e chute(). O método chute() é uma frase ”Pow!” e o
         * método soco() é uma frase “Soc!”. O método combo1() consiste de 2
         * chute() e 1 soco(), o combo2() de 2 soco() e 1 chute() e o combo3()
         * de 1 chute(), 1 soco(), 1 chute() e 1 soco(). Faça com que só seja
         * possível chamar os métodos combo1(), combo2() e combo3() em outras
         * classes. Chame na classe Main os métodos da classe Lutador (apenas os
         * possíveis). (2.0)
         */

        Lutador l1 = new Lutador();

        l1.combo1();
        l1.combo2();
        l1.combo3();
    }
}
