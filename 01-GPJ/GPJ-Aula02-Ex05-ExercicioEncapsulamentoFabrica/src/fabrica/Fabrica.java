/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

/**
 *
 * @author Aluno
 */
public class Fabrica {
    public void produzirCarro(){
        this.construirBase();
        this.colocarComponentes();
        this.pintarCarro();
        this.despacharCarro();
    }
    
    private void construirBase(){
        System.out.println("Construir base~");
    }
    
    private void colocarComponentes(){
        System.out.println("Colocando componentes!!!! ");
    }
    
    private void pintarCarro(){
        System.out.println("pintar carro");
    }
    
    private void despacharCarro(){
        System.out.println("Despachando carro!");
    }
    
}
