/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import pais.BA;
import pais.RJ;
import pais.RS;
import pais.SP;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Exemplo com valor: $100");
        
        BA ba = new BA();
        System.out.println("Desconto Gas..: " + ba.descontoGas(100));
        System.out.println("Imposto Luz...: " + ba.impostoLuz(100));
        ba.comidaMaisVendida();
        
        SP sp = new SP();
        System.out.println("Desconto Gas..: " + sp.descontoGas(100));
        System.out.println("Imposto Luz...: " + sp.impostoLuz(100));
        sp.festaTipica();
        
        
        RJ rj = new RJ();
        System.out.println("Desconto Gas..: " + rj.descontoGas(100));
        System.out.println("Imposto Luz...: " + rj.impostoLuz(100));
        rj.festaTipica();
        
        RS rs = new RS();
        System.out.println("Desconto Gas..: " + rs.descontoGas(100));
        System.out.println("Imposto Luz...: " + rs.impostoLuz(100));
        rs.comidaTipica();
        rs.dancaTipica();
        
                
                
        
    }
}
