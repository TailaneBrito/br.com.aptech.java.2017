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
        String caminho1 = "src\\img\\married.jpg";
        String caminho2 = "src\\img\\single.png";
        String caminho3 = "src\\img\\divorce.png";
        
        ImageIcon ic1 = new ImageIcon(caminho1);
        ImageIcon ic2 = new ImageIcon(caminho2);
        ImageIcon ic3 = new ImageIcon(caminho3);

        JFrame janela = new JFrame();
        JPanel painel = new JPanel();
        
        JButton btn01 = new JButton("Verificar");
        
        JRadioButton radio01 = new JRadioButton("Solteiro");
        JRadioButton radio02 = new JRadioButton("Casado");
        JRadioButton radio03 = new JRadioButton("Divorciado");
        
        ButtonGroup group1 = new ButtonGroup();
        group1.add(radio01);
        group1.add(radio02);
        group1.add(radio03);
        JLabel lblImg = new JLabel();
        
        janela.add(painel);
        painel.add(radio01);
        painel.add(radio02);
        painel.add(radio03);
        painel.add(btn01);
        painel.add(lblImg);
        
        
        
        
        btn01.addActionListener(new ActionListener() {
            

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radio01.isSelected()) {
                    
                    JOptionPane.showMessageDialog(null, "Pode ir pra balada");
                    lblImg.setIcon(ic1);
                    
                }else if(radio02.isSelected()){
                    JOptionPane.showMessageDialog(null, "Segura o facho ai");
                    lblImg.setIcon(ic2);
                }else{
                    JOptionPane.showMessageDialog(null, "Pode sair pra caçar novamente!");
                    lblImg.setIcon(ic3);
                }

            }
        });
        

        //Pegar valores
        //Definir valores
        painel.setBackground(Color.WHITE);
       
        janela.setVisible(true);
        janela.setSize(195, 200);
        janela.setResizable(false);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
