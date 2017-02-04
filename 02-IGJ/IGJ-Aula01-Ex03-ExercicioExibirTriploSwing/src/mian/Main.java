/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        String caminho = "src//imagem//iconEx03.png";
        ImageIcon ic = new ImageIcon(caminho);
        
        
        String numInput = JOptionPane.showInputDialog(null,"Insira um numero");
        
        int num2 = Integer.valueOf(numInput);
        int resp = num2 * 3;
        String mensagem = "O triplo de " + num2 + " é " + resp;
        
        JOptionPane.showMessageDialog(null, mensagem,"Janela1",JOptionPane.INFORMATION_MESSAGE,ic);
        
    }
}
