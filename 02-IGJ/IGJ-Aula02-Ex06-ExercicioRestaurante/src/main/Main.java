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
        String caminho = "src//img//cupcake.png";
        ImageIcon icon = new ImageIcon(caminho);

        JFrame janela = new JFrame();
        JPanel painel = new JPanel();
        painel.setSize(new Dimension(200, 100));

        JButton btnPedido = new JButton("Pedir");
        JLabel lbl01 = new JLabel();
        JLabel lbl02 = new JLabel();
        JLabel lblImg = new JLabel();

        JCheckBox box1 = new JCheckBox();
        JCheckBox box2 = new JCheckBox();
        JCheckBox box3 = new JCheckBox();
        JCheckBox box4 = new JCheckBox();
        JCheckBox box5 = new JCheckBox();

        JTextArea txtArea = new JTextArea();
        txtArea.setSize(20, 200);

        //Configuracao de texto
        box1.setText("Arroz");
        box2.setText("Feijão");
        box3.setText("Carne");
        box4.setText("Batata Frita");
        box5.setText("Salada");

        //Adicionar elementos
        janela.add(painel);
        painel.add(lblImg);
        painel.add(box1);
        painel.add(box2);
        painel.add(box3);
        painel.add(box4);
        painel.add(box5);

        painel.add(btnPedido);
        painel.add(lbl01);

        painel.add(btnPedido);
        painel.add(lbl01);
        painel.add(lbl02);

        //Calculo
        btnPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                String palavra="Pediu ";
                
                
                if (box1.isSelected()) {
                    palavra = palavra + " Arroz ";
                }
                if (box2.isSelected()) {
                    palavra = palavra + " Feijão ";
                }
                if (box3.isSelected()) {
                    palavra = palavra + " Carne ";
                }
                if (box4.isSelected()) {
                    palavra = palavra + " Batata frita";
                }
               
                
                            
                System.out.println(palavra);
               
                lbl01.setText(palavra);

            }
        });

        //Pegar valores
        //Definir valores
        painel.setBackground(Color.LIGHT_GRAY);

        janela.setVisible(true);
        janela.setSize(300, 250);
        janela.setResizable(false);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
