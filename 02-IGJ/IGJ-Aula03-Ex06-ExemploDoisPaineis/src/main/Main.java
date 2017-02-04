/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        JPanel painelMestre = new JPanel(new GridLayout(1,2));
       
        
        JPanel painel01 = new JPanel();
        JPanel painel02 = new JPanel();
        
        painel01.setBackground(Color.ORANGE);
        painel02.setBackground(Color.YELLOW);
        
        janela.setVisible(true);
        janela.add(painelMestre);
        painelMestre.add(painel01);
        painelMestre.add(painel02);
        janela.setSize(250, 250);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
