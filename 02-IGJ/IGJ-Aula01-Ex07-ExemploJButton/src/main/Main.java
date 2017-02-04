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
        //Declaracao de objetos
        JFrame janela = new JFrame();
        JPanel painel = new JPanel();
        JButton btn01 = new JButton("Vermelho");
        
        //Adicionar os objetos na janela
        janela.add(painel);
        painel.add(btn01);    
        //Adicionar os objetos no painel
            
        //Metodos
        btn01.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                painel.setBackground(Color.red);
            }
        
        });
          
        
        
        
        //Configuracao de objetos
        janela.setSize(300,300);
        painel.setBackground(Color.CYAN);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //outros métodos
        //.setTitle();
        //janela.setResizable(true);
        
    }
}
