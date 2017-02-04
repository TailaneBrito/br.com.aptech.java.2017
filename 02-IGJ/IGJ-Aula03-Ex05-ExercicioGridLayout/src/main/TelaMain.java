/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Aluno
 */
public class TelaMain {
    public static void main(String[] args) {
        JFrame frmJanela = new JFrame();         //lin,col
        JPanel pnlPainel = new JPanel(new GridLayout(3,3));
        
        JButton btn01 = new JButton("1"); 
        
        JButton btn02 = new JButton("2"); 
        
        JButton btn03 = new JButton("3");
        
        JButton btn04 = new JButton("4");
       
        JButton btn05 = new JButton("5"); 
       
        JButton btn06 = new JButton("6");
        
        JButton btn07 = new JButton("7");
        
        JButton btn08 = new JButton("8");
        
        JButton btn09 = new JButton("9");
        
        
        btn05.setEnabled(false);
        
        
        frmJanela.setVisible(true);
        frmJanela.add(pnlPainel);
        pnlPainel.add(btn01);
        pnlPainel.add(btn02);
        pnlPainel.add(btn03);
        pnlPainel.add(btn04);
        pnlPainel.add(btn05);
        pnlPainel.add(btn06);
        pnlPainel.add(btn07);
        pnlPainel.add(btn08);
        pnlPainel.add(btn09);
       
       
        frmJanela.setSize(200,200);
        pnlPainel.setBackground(Color.lightGray);
        
        frmJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
