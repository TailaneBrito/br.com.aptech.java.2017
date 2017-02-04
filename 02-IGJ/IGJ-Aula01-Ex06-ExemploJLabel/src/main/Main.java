/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.text.html.HTML.Tag.FONT;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        JPanel painel = new JPanel();
        
        
        painel.setBackground(Color.LIGHT_GRAY);
        janela.add(painel);
        
        JLabel text1 = new JLabel("Exemplo de texto");
        JLabel text2 = new JLabel("Exemplo de texto2");
        JLabel text3 = new JLabel("Exemplo de texto3");      
        
        text3.setForeground(Color.RED);
        
        
        painel.add(text1);
        painel.add(text2);
        painel.add(text3);
                
        
        janela.setSize(300,300);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
}
