/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classes.Caninos;
import classes.Felinos;
import classes.Mamiferos;

/**
 *
 * @author tailaneb
 */
public class Main {

    public static void main(String[] args) {
        
        /**
         * 8. Crie uma classe abstrata Mamifero com um 
         * método abstrato que não retorna nada e não 
         * receba argumentos chamado ruído. Crie 2 classes 
         * filhas Felinos e Caninos que informe os 
         * respectivos ruídos que esses animais fazem: 
         * “miau!” e “auau!”. Crie a Classe Main que mostrará 
         * todos os métodos de cada classe (possíveis). (1.0)
         */
        
        Caninos cachorro = new Caninos();
        Felinos gato = new Felinos();

        cachorro.ruido();
        gato.ruido();

    }
}
