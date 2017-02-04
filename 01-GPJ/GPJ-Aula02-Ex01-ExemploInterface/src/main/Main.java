/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import animais.Cachorro;
import animais.Girafa;
import animais.Jacare;
import animais.Lobo;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.comer();
        c.latir();
        c.mamar();
        c.uivar();
        
        Girafa g = new Girafa();
        g.mamar();
        
        
        Jacare j = new Jacare();
        j.comer();
        
        
        Lobo l = new Lobo();
        l.comer();
        l.latir();
        l.mamar();
        l.uivar();
        
        
        
    }
}
