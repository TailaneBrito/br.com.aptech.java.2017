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
import javax.swing.JTextField;

/**
 *
 * @author Aluno
 */
public class TelaMain {
    public static void main(String[] args) {
        //Criar caixa de login e senha
        JFrame frmJanela = new JFrame();
        JPanel pnlPainel = new JPanel();
        
        JButton btnBotao = new JButton("Acessar");
        JLabel lblLogin = new JLabel("Login: ");
        JTextField txtLogin = new JTextField();
        JLabel lblSenha = new JLabel("Senha: ");
        JPasswordField txtSenha = new JPasswordField();
        
        
        txtLogin.setPreferredSize(new Dimension(130,30));
        txtSenha.setPreferredSize(new Dimension(130,30));
        
        btnBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String login, senha;
                
                login = String.valueOf(txtLogin.getText());
                senha = String.valueOf(txtSenha.getPassword());

                if (login.equals("aluno") && senha.equals("123abc")) {
                    JOptionPane.showMessageDialog(null, "Logado!");
                    frmJanela.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "ACESSO NEGADO");
                    txtLogin.setText(" ");
                    txtSenha.setText(" ");
                }
            }
        });
        
               
        frmJanela.setVisible(true);
        frmJanela.add(pnlPainel);
        pnlPainel.add(lblLogin);
        pnlPainel.add(txtLogin);
        pnlPainel.add(lblSenha);
        pnlPainel.add(txtSenha);
        pnlPainel.add(btnBotao);
        frmJanela.setSize(200,250);
        pnlPainel.setBackground(Color.lightGray);
        
        frmJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
