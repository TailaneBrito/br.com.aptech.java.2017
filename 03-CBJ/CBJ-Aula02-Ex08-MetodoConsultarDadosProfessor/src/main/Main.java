/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.ProfessorDAO;

/**
 *
 * @author Aluno
 */
public class Main {
    public static int opcao; 
    
    public static void main(String[] args) throws ClassNotFoundException {
        ProfessorDAO p = new ProfessorDAO();
        
        opcao = 2;
        
        switch(opcao){
            case 1:
               p.mostrarTudo(1);
               break;
            case 2:
               p.mostrarSoNome(2);
               break;
            case 3:
               p.verificarMaior30(1);
               break;
        }
        
        
        
        
        
        
        
        
    }
}
