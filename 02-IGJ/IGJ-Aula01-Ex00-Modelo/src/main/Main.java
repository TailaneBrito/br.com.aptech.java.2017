/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.awt.Color;
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
        
        
        painel.setBackground(Color.CYAN);
        janela.add(painel);
        
        
        janela.setVisible(true);
        
        janela.setSize(300,300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}
