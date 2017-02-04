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
        String caminho = "src//imagens//carteira.jpg";
        String caminho1 = "src//imagens//school.jpg";
        
        ImageIcon ic = new ImageIcon(caminho);
        ImageIcon ic1 = new ImageIcon(caminho1);

        String nome = JOptionPane.showInputDialog(null, "Qual o seu nome? ", " ");

        int pergunta1 = JOptionPane.showConfirmDialog(null, "Você possui habilitação? ", "resposta", 0, 0, ic);
        int resp = pergunta1;

        if (pergunta1 == 0) {
            JOptionPane.showMessageDialog(null, nome + " Você pode dirigir!! ", "Resultado", JOptionPane.INFORMATION_MESSAGE, ic);
        } else {
            JOptionPane.showMessageDialog(null, nome + " VAI TIRAR A HABILITAÇÃO!!!! ", "Resultado", JOptionPane.INFORMATION_MESSAGE, ic1);
        }
    }

}
