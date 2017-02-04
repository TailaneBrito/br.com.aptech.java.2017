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
public class TI extends Funcionario{
    
    public TI(){
        System.out.println("TI");
        
    }
    
    @Override
    public void trabalha() {
        System.out.println("Trabalha com Suporte de Máquinas e Servidores");   
    }
    
    @Override
    public void horasTrabalhadas(){
        System.out.println("das 09:00 às 20:00");
    }
    
}
