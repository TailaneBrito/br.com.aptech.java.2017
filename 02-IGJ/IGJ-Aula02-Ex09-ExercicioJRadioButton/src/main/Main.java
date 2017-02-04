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
        String caminho1 = "src\\img\\show.jpg";
        
        ImageIcon ic1 = new ImageIcon(caminho1);
     
        JFrame janela = new JFrame();
        JPanel painel = new JPanel();
        
        JButton btn01 = new JButton("Verificar");
        JLabel lblImg = new JLabel();
        JLabel lblResp = new JLabel();
        
        JLabel lbl01 = new JLabel("Qual é a cor do cavalo \n branco de napoleão?");
        
        JRadioButton radio01 = new JRadioButton("Rosa");
        
        JRadioButton radio02 = new JRadioButton("Preto");
        JRadioButton radio03 = new JRadioButton("Branco");
        JRadioButton radio04 = new JRadioButton("Cinza");
        JRadioButton radio05 = new JRadioButton("Marrom");
        
        ButtonGroup group1 = new ButtonGroup();
        group1.add(radio01);
        group1.add(radio02);
        group1.add(radio03);
        group1.add(radio04);
        group1.add(radio05);
        
        lblImg.setIcon(ic1);
        
        janela.add(painel);
        painel.add(lblImg);
        painel.add(lbl01);
        painel.add(radio01);
        painel.add(radio02);
        painel.add(radio03);
        painel.add(radio04);
        painel.add(radio05);
        painel.add(btn01);
        painel.add(lblResp);
       
        
         
        btn01.addActionListener(new ActionListener() {
            

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radio03.isSelected()) {
                    lblResp.setText("Acertou!");
                }else{
                    lblResp.setText("Errou");
                }

            }
        });
        

        //Pegar valores
        //Definir valores
        painel.setBackground(Color.WHITE);
       
        janela.setVisible(true);
        janela.setSize(300, 300);
        janela.setResizable(false);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
