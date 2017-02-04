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
import javax.swing.*;

/**
 *
 * @author Aluno
 */
public class Main {
   
    public static void main(String[] args) {
        //Variaveis
        //int resp = 0;
        String caminho = "src//img//Calculator.png";
        ImageIcon icon = new ImageIcon(caminho);
        

        JFrame janela = new JFrame();
        JPanel painel = new JPanel();
        JButton btnSoma = new JButton("+");
        JButton btnSub = new JButton("-");
        JButton btnMulti = new JButton("x");
        JButton btnDiv = new JButton("/");
        JLabel lbl01 = new JLabel("Valor 1: ");
        JTextField txt01 = new JTextField();
        JLabel lbl02 = new JLabel("Valor 2: ");
        JTextField txt02 = new JTextField();
        JLabel lbl03 = new JLabel();
        JLabel lblImg = new JLabel();

        txt01.setPreferredSize(new Dimension(30, 30));
        txt02.setPreferredSize(new Dimension(30, 30));
        
        lblImg.setIcon(icon);
        
        //Adicionar elementos
        janela.add(painel);
        painel.add(lbl01);
        painel.add(txt01);
        painel.add(lbl02);
        painel.add(txt02);
        painel.add(btnSoma);
        painel.add(btnDiv);
        painel.add(btnMulti);
        painel.add(btnSub);
        painel.add(lbl03);
        painel.add(lblImg);
        
     
        //Calculo
        btnSoma.addActionListener(new ActionListener() {
            private int resp = 0;

            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor1 = txt01.getText();
                int val1 = Integer.valueOf(valor1);

                String valor2 = txt02.getText();
                int val2 = Integer.valueOf(valor2);

                this.resp = val1 + val2;
                lbl03.setText("  " + this.resp);

            }
        });
        
        btnDiv.addActionListener(new ActionListener() {
            private int resp = 0;

            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor1 = txt01.getText();
                int val1 = Integer.valueOf(valor1);

                String valor2 = txt02.getText();
                int val2 = Integer.valueOf(valor2);

                this.resp = val1 / val2;
                lbl03.setText("  " + this.resp);

            }
        });
        
        btnSub.addActionListener(new ActionListener() {
            private int resp = 0;

            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor1 = txt01.getText();
                int val1 = Integer.valueOf(valor1);

                String valor2 = txt02.getText();
                int val2 = Integer.valueOf(valor2);

                this.resp = val1 - val2;
                lbl03.setText("   " + this.resp);

            }
        });
        
        btnMulti.addActionListener(new ActionListener() {
            private int resp = 0;

            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor1 = txt01.getText();
                int val1 = Integer.valueOf(valor1);

                String valor2 = txt02.getText();
                int val2 = Integer.valueOf(valor2);

                this.resp = val1 * val2;
                lbl03.setText("   " + this.resp);

            }
        });
        

        //Pegar valores
        //Definir valores
        painel.setBackground(Color.LIGHT_GRAY);
       
        janela.setVisible(true);
        janela.setSize(195, 200);
        janela.setResizable(false);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
