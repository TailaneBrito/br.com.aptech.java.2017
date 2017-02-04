/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        JPanel painel = new JPanel();
        JButton btn01 = new JButton("Verificar");
        JLabel lbl01 = new JLabel("Digite sua idade: ");
        JLabel lbl02 = new JLabel();
        JTextField txt01 = new JTextField();
        txt01.setPreferredSize(new Dimension(40, 30));
        
        
        janela.add(painel);
        
        painel.setBackground(Color.ORANGE);
        
        painel.add(lbl01);
        painel.add(txt01);
        painel.add(btn01);
        painel.add(lbl02);
        
        
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor1 = txt01.getText();
                int valor2 = Integer.valueOf(valor1);
                
                if (valor2 >= 18) {
                    
                    lbl02.setText("Maior de idade");
                    //System.out.println();
                }else{
                    lbl02.setText("Menor de idade");
                    //System.out.println("Menor de idade");
                }
            }
        });
        
        
        
        
        janela.setSize(150, 150);
        janela.setResizable(false);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
