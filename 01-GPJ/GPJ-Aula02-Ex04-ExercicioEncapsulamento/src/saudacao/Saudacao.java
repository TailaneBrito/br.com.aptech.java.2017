/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saudacao;

/**
 *
 * @author Aluno
 */
public class Saudacao {
    protected void chama(){
        introducao();
        dialogo();
        despedida();
    }
    
    
    private void introducao(){
        System.out.println("Olá~");
    }
    
    
    private void dialogo(){
        System.out.println("bla bla bla bla bla");
    }
    
    private void despedida(){
        System.out.println("Até mais~");
    }
}
