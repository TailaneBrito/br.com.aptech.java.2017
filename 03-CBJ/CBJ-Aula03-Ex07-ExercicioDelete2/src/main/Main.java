/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import conexao.ConexaoDB;
import static conexao.ConexaoDB.conexao;
import static conexao.ConexaoDB.stmt;
import dao.GerenteDAO;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {
   
    
    public static void main(String[] args) throws ClassNotFoundException {
        GerenteDAO gerente = new GerenteDAO();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um salario: ");
        GerenteDAO.salario = sc.nextInt();
     
        try {
            
            ConexaoDB db = new ConexaoDB();
            db.conectarDB();
            
            
            gerente.deletarGerentePorSalario(GerenteDAO.salario);
            
            stmt.close();
            conexao.close();
            

        } catch (java.sql.SQLException e) {
            System.err.println("Nao conectou com o banco!");
            System.out.println("Error " + e);
        }
    }
}
