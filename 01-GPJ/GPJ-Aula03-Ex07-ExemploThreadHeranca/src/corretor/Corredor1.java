/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corretor;

/**
 *
 * @author Aluno
 */
public class Corredor1 extends Thread{
    
    public void run(){
        for (int i = 1; i <= 500; i++) {
            System.out.println("Corretor 1 " + i);  
        }
        
      
    }
}
