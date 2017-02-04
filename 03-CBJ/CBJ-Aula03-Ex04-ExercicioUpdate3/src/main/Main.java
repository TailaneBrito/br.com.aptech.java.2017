/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import conexao.ConexaoDB;
import static conexao.ConexaoDB.conexao;
import static conexao.ConexaoDB.stmt;
import conexao.UpdateQuery;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author tnbrito
 */
public class Main {
    static int idgerente;
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1- Registrar o JDBC
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o id do gerente: ");
        idgerente = sc.nextInt();
        String setor = "CENTRO";          
        double salario = 500;
     
        try {
            
            ConexaoDB db = new ConexaoDB();
            db.conectarDB();
            
            UpdateQuery update = new UpdateQuery();
            update.alterar(idgerente);
            
            stmt.close();
            conexao.close();
            

        } catch (java.sql.SQLException e) {
            System.err.println("Nao conectou com o banco!");
            System.out.println("Error " + e);
        }

    }
}
