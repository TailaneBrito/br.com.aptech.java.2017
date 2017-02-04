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
    public static void main(String[] args) throws ClassNotFoundException {
        ProfessorDAO prof = new ProfessorDAO();
        prof.cadastrarProfessor("Bruno", 35, 4000, "COBOL");
        
    }
}
