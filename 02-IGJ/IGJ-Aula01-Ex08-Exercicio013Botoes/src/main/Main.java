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
import javax.swing.plaf.basic.BasicSliderUI;


/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        JPanel painel = new JPanel();
        JButton btn01 = new JButton("Azul");
        JButton btn02 = new JButton("Verde");
        JButton btn03 = new JButton("Vermelho");
        
        janela.add(painel);
        
        painel.add(btn01);
        painel.add(btn02);
        painel.add(btn03);
        
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painel.setBackground(Color.blue);
            }
        });
        
        btn02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painel.setBackground(Color.GREEN);
            }
        });
        
        btn03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painel.setBackground(Color.red);
            }
        });
        
        
        
        
        
        
        
        
        
        
        janela.setVisible(true);
        janela.setSize(300,300);
        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
