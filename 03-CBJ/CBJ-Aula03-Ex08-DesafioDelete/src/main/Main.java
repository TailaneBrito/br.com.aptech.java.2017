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
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {
    /*
    criar uma interface que junte os 2 programas acima e o usuário
    decide se quer deletar um gerente ou um vendedor, ambos de id.
    */
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        GerenteDAO gerente = new GerenteDAO();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um salario: ");
        GerenteDAO.salario = sc.nextInt();
     
       
            
            ConexaoDB db = new ConexaoDB();
            db.conectarDB();
            
            
            gerente.deletarGerentePorSalario(GerenteDAO.salario);
            
            stmt.close();
            conexao.close();
            

       
    }
}
