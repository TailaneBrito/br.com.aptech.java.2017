/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import empresas.Empresas;
/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Empresas f2 = new Empresas();
                
        //método Static
        Empresas.contratarTI();
        
        //método nao Static
        f2.contrataADM();
        
    }
}
