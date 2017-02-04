/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author Aluno
 */
public class MainTela {
    public static void main(String[] args) {
        
    
    JFrame janela = new JFrame();
    JPanel painel = new JPanel();
    JLabel lbl01 = new JLabel();
    painel.setBackground(Color.yellow);
    
    JPasswordField caixaSenha = new JPasswordField();
    caixaSenha.setPreferredSize(new Dimension(130,30));
    
    JButton btn01 = new JButton("Olhar senha");
    
    btn01.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            //pegar senha
            String valor = String.valueOf(caixaSenha.getPassword());
            //mostrar senha
            JOptionPane.showMessageDialog(null, "senha digitada: " + valor);
            //String mensagem = "senha digitada " + valor;
            lbl01.setText("senha digitada " + valor);
        }
    });
    
    
    
    janela.setVisible(true);
    janela.add(painel);
    painel.add(caixaSenha);
    painel.add(btn01);
    painel.add(lbl01);
    janela.setSize(250,150);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
