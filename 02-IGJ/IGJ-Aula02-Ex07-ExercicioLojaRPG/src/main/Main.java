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

        String caminho1 = "src//img//sword.png";
        String caminho2 = "src//img//shield.png";
        String caminho3 = "src//img//crossbow.png";
        String caminho4 = "src//img//bomb.png";

        ImageIcon icon1 = new ImageIcon(caminho1);
        ImageIcon icon2 = new ImageIcon(caminho2);
        ImageIcon icon3 = new ImageIcon(caminho3);
        ImageIcon icon4 = new ImageIcon(caminho4);

        JLabel lblImg1 = new JLabel();
        lblImg1.setIcon(icon1);
        JLabel lblImg2 = new JLabel();
        lblImg2.setIcon(icon2);
        JLabel lblImg3 = new JLabel();
        lblImg3.setIcon(icon3);
        JLabel lblImg4 = new JLabel();
        lblImg4.setIcon(icon4);
        JLabel lbl01 = new JLabel();
        JLabel lbl02 = new JLabel();

        JCheckBox box1 = new JCheckBox();
        JCheckBox box2 = new JCheckBox();
        JCheckBox box3 = new JCheckBox();
        JCheckBox box4 = new JCheckBox();

        JFrame janela = new JFrame();
        JPanel painel = new JPanel();
        painel.setSize(new Dimension(200, 100));
        JPanel painel2 = new JPanel();
        painel2.setSize(new Dimension(200, 200));

        //Configuracao de texto
        box1.setText("Espada");
        lblImg1.setIcon(icon1);
        box2.setText("Escudo");
        lblImg2.setIcon(icon2);
        box3.setText("Flecha");
        lblImg3.setIcon(icon3);
        box4.setText("Bomba");
        lblImg4.setIcon(icon4);

        JButton btnPedido = new JButton("Pedir");

        lbl01.setSize(50, 200);
        JLabel lblImg = new JLabel();

        //Adicionar elementos
        janela.add(painel);
        painel.add(lblImg);
        painel.add(box1);
        painel.add(lblImg1);
        painel.add(box2);
        painel.add(lblImg2);
        painel.add(box3);
        painel.add(lblImg3);
        painel.add(box4);
        painel.add(lblImg4);
        painel.add(btnPedido);
        painel.add(lbl01);
        painel.add(lbl02);

        //Calculo
        btnPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String palavra = "Comprando ";
                int valor = 0;

                if (box1.isSelected()) {
                    palavra = palavra + " Espada ";
                    valor += 100;
                }
                if (box2.isSelected()) {
                    palavra = palavra + " Escudo ";
                    valor += 150;
                }
                if (box3.isSelected()) {
                    palavra = palavra + " Flecha ";
                    valor += 10;
                }
                if (box4.isSelected()) {
                    palavra = palavra + " Bomba";
                    valor += 30;
                }

                lbl01.setText(palavra);
                lbl02.setText("Total: " + valor);

            }
        });

        //Pegar valores
        //Definir valores
        painel.setBackground(Color.LIGHT_GRAY);
        painel2.setBackground(Color.WHITE);
        janela.setVisible(true);
        janela.setSize(400, 250);
        janela.setResizable(false);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
