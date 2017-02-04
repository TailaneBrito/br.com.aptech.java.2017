/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Aluno
 */
public class TelaMain {
    public static void main(String[] args) {
        JFrame frmJanela = new JFrame();
        JPanel pnlPainel = new JPanel(new BorderLayout());
        JButton btn01 = new JButton("Leste"); 
        btn01.setBackground(Color.RED);
        JButton btn02 = new JButton("Oeste"); 
        btn02.setBackground(Color.GREEN);
        JButton btn03 = new JButton("Norte");
        btn03.setBackground(Color.ORANGE);
        JButton btn04 = new JButton("Sul");
        btn04.setBackground(Color.BLUE);
        JButton btn05 = new JButton("Centro"); 
        btn05.setBackground(Color.WHITE);
        
        frmJanela.setVisible(true);
        frmJanela.add(pnlPainel);
        pnlPainel.add(btn01, BorderLayout.EAST);
        pnlPainel.add(btn02, BorderLayout.WEST);
        pnlPainel.add(btn03, BorderLayout.NORTH);
        pnlPainel.add(btn04, BorderLayout.SOUTH);
        pnlPainel.add(btn05, BorderLayout.CENTER);
        frmJanela.setSize(400,400);
        pnlPainel.setBackground(Color.lightGray);
        
        frmJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
