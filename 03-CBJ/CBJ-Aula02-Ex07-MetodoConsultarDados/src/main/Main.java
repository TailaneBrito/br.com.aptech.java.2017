/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.AlunoDAO;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        AlunoDAO aluno = new AlunoDAO();
        aluno.consultarAluno(10);
    }
}
