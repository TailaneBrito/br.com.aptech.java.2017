/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import armas.Pistolas;
import armas.PistolasAutomatica;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("Pistolas ");
        Pistolas p1 = new Pistolas();
        p1.descricao();

        PistolasAutomatica p2 = new PistolasAutomatica();
        p2.descricao();

    }
}
