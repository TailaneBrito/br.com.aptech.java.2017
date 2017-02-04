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
public class Corredor2 extends Thread{
    
    @Override
    public void run(){
        for (int i = 1; i <= 500; i++) {
            System.err.println("            Corretor 2 " + i);
            
        }
    }
}
