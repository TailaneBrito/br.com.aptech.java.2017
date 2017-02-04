/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package func;

/**
 *
 * @author Aluno
 */
public class Adm extends Funcionario{
    public Adm(){
        System.out.println("ADM");
    }
    
    @Override
    public void trabalha() {
        System.out.println("Trabalha com Contrados");   
    }
    
}
