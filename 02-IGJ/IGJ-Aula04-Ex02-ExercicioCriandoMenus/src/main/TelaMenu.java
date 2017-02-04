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
public class TelaMenu {
    public static void main(String[] args) {
        
        String caminho1 = "src\\img\\proj.jpg";
        ImageIcon ic = new ImageIcon(caminho1);
        JFrame janela = new JFrame();
        JPanel painel = new JPanel();
        JLabel lblImg = new JLabel();
        lblImg.setVisible(false);
        
        JMenuBar barra1 = new JMenuBar();
        
        
        //Menus da barra de menu
        JMenu Mn01Arq = new JMenu("Arquivo");
        JMenu Mn01Fer = new JMenu("Ferramentas");
        JMenuItem Mn01Aju = new JMenu("Ajuda");
        barra1.add(Mn01Arq);
        barra1.add(Mn01Fer);
        barra1.add(Mn01Aju);
        
        //Menus do Mn01Arq
        JMenuItem Mn01Arq01Abr = new JMenuItem("Abrir");
        JMenu     Mn01Arq02Nov = new JMenu("Novo");
        JMenuItem Mn01Arq03Sai = new JMenuItem("Sair");
        Mn01Arq.add(Mn01Arq01Abr);
        Mn01Arq.add(Mn01Arq02Nov);
        Mn01Arq.add(Mn01Arq03Sai);
        
        //Menus do Mn01Arq01Nov
        JMenuItem Mn01Arq01Nov01Pro = new JMenuItem("Projeto");
        JMenuItem Mn01Arq01Nov02Arq = new JMenuItem("Arquivo");
        Mn01Arq02Nov.add(Mn01Arq01Nov01Pro);
        Mn01Arq02Nov.add(Mn01Arq01Nov02Arq);
        
        //adicionar imagem no Mn01Arq01Nov01Pro
        Mn01Arq01Nov01Pro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               lblImg.setVisible(true);
               lblImg.setIcon(ic);
            }
        });
        
        
        //Menu Mn01Fer
        JMenuItem Mn01Fer01Azu = new JMenuItem("Janela Azul");
        JMenuItem Mn01Fer02Ver = new JMenuItem("Janela Verde");
        Mn01Fer.add(Mn01Fer01Azu);
        Mn01Fer.add(Mn01Fer02Ver);
        
        //Acao dos menus Mn01Fer01Azu
        Mn01Fer01Azu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painel.setBackground(Color.BLUE);
            }
        });
       
        //Acao dos menus Mn01Fer01Ver
        Mn01Fer02Ver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                painel.setBackground(Color.GREEN);
            }
        });
        
        
        
        painel.setBackground(Color.yellow);
        painel.add(lblImg);
        
        janela.setJMenuBar(barra1);
        janela.add(painel);
        janela.setVisible(true);
        janela.setSize(250, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
