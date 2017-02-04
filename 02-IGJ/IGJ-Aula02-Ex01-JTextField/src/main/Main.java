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
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        JFrame janela = new JFrame();
        JPanel painel = new JPanel();
        JLabel label = new JLabel();
        
        JTextField txt01 = new JTextField();
        txt01.setPreferredSize(new Dimension(120,30));
        
        JButton btn01 = new JButton("Pegar texto");
        
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String valor = txt01.getText();
                lista.add(valor);
                System.out.println("Valor da caixa: " + valor);
                label.setText(valor);
                System.out.println(lista);
                JOptionPane.showMessageDialog(null, valor);
            }
        });
        
        //adicionar elementos
        janela.add(painel);
        painel.add(btn01);
        painel.add(txt01);
        painel.add(label);
        
        janela.setVisible(true);
        janela.setSize(300,300);
        janela.setBackground(Color.pink);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
