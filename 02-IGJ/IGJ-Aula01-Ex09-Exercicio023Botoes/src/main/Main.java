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
        JButton btn02 = new JButton("02-Verde");
        JButton btn03 = new JButton("03-Vermelho");
        
        janela.add(painel);
        
        painel.add(btn01);
        painel.add(btn02);
        painel.add(btn03);
        
        btn02.setVisible(false);
        btn03.setVisible(false);
        
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painel.setBackground(Color.blue);
                btn01.setVisible(false);
                btn02.setVisible(true);
            }
        });
        
        btn02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painel.setBackground(Color.GREEN);
                btn02.setVisible(false);
                btn03.setVisible(true);
            }
        });
        
        btn03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painel.setBackground(Color.red);
                btn03.setVisible(false);
                btn01.setVisible(true);
            }
        });
        
        
        
        
        
        
        
        
        
        
        janela.setVisible(true);
        janela.setSize(300,300);
        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
