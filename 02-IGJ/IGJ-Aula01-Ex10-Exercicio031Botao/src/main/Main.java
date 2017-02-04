/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Aluno
 */
public class Main {
    
    
    
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        JPanel painel = new JPanel();
        JButton btn01 = new JButton("01-Azul");
        
        
        janela.add(painel);
        
        painel.add(btn01);
       
        
        btn01.addActionListener(new ActionListener() {
            private int cont=0;
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                painel.setBackground(Color.blue);
                this.cont++;
                
                if(this.cont==1){
                painel.setBackground(Color.red);
                cont=0;
                }
                
                
            }
        });
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        janela.setVisible(true);
        janela.setSize(300,300);
        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
