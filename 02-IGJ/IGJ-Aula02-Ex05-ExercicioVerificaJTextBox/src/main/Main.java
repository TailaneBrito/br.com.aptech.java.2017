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
        //Variaveis
        //int resp = 0;
        String caminho = "src//img//doubt.jpg";
        ImageIcon icon = new ImageIcon(caminho);
        
        JFrame janela = new JFrame();
        JPanel painel = new JPanel();
        JCheckBox box1 = new JCheckBox();
        JCheckBox box2 = new JCheckBox();
        JCheckBox box3 = new JCheckBox();
 
       
        JLabel lbl01 = new JLabel();
        
        
        JButton btnVerifica = new JButton("Verificar");
        
        JLabel lblImg = new JLabel();
       
        lblImg.setIcon(icon);
        
        //Adicionar elementos
        painel.add(lblImg);
        janela.add(painel);
        painel.add(box1);
        painel.add(box2);
        painel.add(box3);
      
        painel.add(btnVerifica);
        painel.add(lbl01);
       
        
     
        //Calculo
        btnVerifica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (box1.isSelected() && box2.isSelected() && box3.isSelected()) {
                    lbl01.setText("Verdade");
                }else{
                    lbl01.setText("Falso");
                }
 
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
