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
        //JANELA POP-UP
        String caminho = "src//imagem//iconEx01.png";
        ImageIcon ic = new ImageIcon(caminho);

        //JOPTION PANE
        JOptionPane.showMessageDialog(null, "Olá Mundo", "Ex01", JOptionPane.INFORMATION_MESSAGE, ic);
        JOptionPane.showMessageDialog(null, "Olá Mundo", "Ex01", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Olá Mundo", "Ex01", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Olá Mundo", "Ex01", JOptionPane.QUESTION_MESSAGE);

        //BUTTONS
        int valor = JOptionPane.showConfirmDialog(null, "Voce gosta de futebol?", "Pergunta", JOptionPane.YES_NO_OPTION);
        System.out.println("Valor: " + valor);

        int valor2 = JOptionPane.showConfirmDialog(null, "Voce gosta de basquete?", "Pergunta 2", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println("Valor2: " + valor2);

        //CAIXAS DE DIALOGO
        String resp = JOptionPane.showInputDialog(null, "Escreva o seu nome: ", " ");
        System.out.println("Resp1: " + resp);

    }
}
