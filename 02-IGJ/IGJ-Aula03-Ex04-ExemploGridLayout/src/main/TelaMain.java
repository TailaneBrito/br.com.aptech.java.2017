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
        JPanel pnlPainel = new JPanel(new GridLayout(2,3));
        
        JButton btn01 = new JButton("1"); 
        btn01.setBackground(Color.BLUE);
        JButton btn02 = new JButton("2"); 
        btn02.setBackground(Color.YELLOW);
        JButton btn03 = new JButton("3");
        btn03.setBackground(Color.RED);
        JButton btn04 = new JButton("4");
        btn04.setBackground(Color.GREEN);
        JButton btn05 = new JButton("5"); 
        btn05.setBackground(Color.BLUE);
        JButton btn06 = new JButton("6");
        btn06.setBackground(Color.YELLOW);
        
        frmJanela.setVisible(true);
        frmJanela.add(pnlPainel);
        pnlPainel.add(btn01);
        pnlPainel.add(btn02);
        pnlPainel.add(btn03);
        pnlPainel.add(btn04);
        pnlPainel.add(btn05);
        pnlPainel.add(btn06);
       
        frmJanela.setSize(200,200);
        pnlPainel.setBackground(Color.lightGray);
        
        frmJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
