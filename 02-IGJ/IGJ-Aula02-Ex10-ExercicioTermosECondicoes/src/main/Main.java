/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        String caminho1 = "src\\img\\contract.png";

        ImageIcon ic1 = new ImageIcon(caminho1);

        JFrame janela = new JFrame();
        JPanel painel = new JPanel();

        JButton btn01 = new JButton("Continuar");
        JLabel lblImg = new JLabel();
        JLabel lblResp = new JLabel();

        JLabel lbl01 = new JLabel("Termos e Condições");

        JRadioButton radio01 = new JRadioButton("Aceito");

        JRadioButton radio02 = new JRadioButton("Discordo");

        ButtonGroup group1 = new ButtonGroup();
        group1.add(radio01);
        group1.add(radio02);

        lblImg.setIcon(ic1);

        janela.add(painel);
        painel.add(lblImg);
        painel.add(lbl01);
        painel.add(radio01);
        painel.add(radio02);

        painel.add(btn01);

        radio01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                btn01.setEnabled(true);

            }
        });

        radio02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                btn01.setEnabled(false);

            }
        });

        btn01.setEnabled(false);

        btn01.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                janela.dispose();

            }
        });

        //Pegar valores
        //Definir valores
        painel.setBackground(Color.WHITE);

        janela.setVisible(true);
        janela.setSize(150, 300);
        janela.setResizable(false);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
