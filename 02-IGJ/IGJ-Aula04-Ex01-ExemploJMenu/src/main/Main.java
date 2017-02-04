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
        JFrame frmJanela = new JFrame();
        JPanel pnlPainel = new JPanel();

        pnlPainel.setBackground(Color.yellow);

        //criar a barra de menus
        JMenuBar mnBar1 = new JMenuBar();

        //criar os tres menus, menu1, menu2, menu3
        JMenu menu1 = new JMenu("Opção 1");
        JMenu menu2 = new JMenu("Opção 2");
        JMenuItem menu3 = new JMenuItem("Opção 3");

        //adicionar os menus na barra
        mnBar1.add(menu1);
        mnBar1.add(menu2);
        mnBar1.add(menu3);

        //menu1
        JMenuItem menu1a = new JMenuItem("Café");
        JMenuItem menu1b = new JMenuItem("Almoço");
        JMenuItem menu1c = new JMenuItem("Janta");
        menu1.add(menu1a);
        menu1.add(menu1b);
        menu1.add(menu1c);

        //menu2
        JMenu menu2a = new JMenu("Escola");
        JMenuItem menu2b = new JMenu("Empresa");
        menu2.add(menu2a);
        menu2.add(menu2b);

        //menu2a
        JMenuItem menu2a1 = new JMenuItem("Aluno");
        JMenuItem menu2a2 = new JMenuItem("Professor");

        menu2a.add(menu2a1);
        menu2a.add(menu2a2);

        //adicionar o menu na janela
        frmJanela.setJMenuBar(mnBar1);

        frmJanela.add(pnlPainel);
        //pnlPainel.add(mnBar1);

        frmJanela.setSize(250, 300);
        frmJanela.setVisible(true);
        frmJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
