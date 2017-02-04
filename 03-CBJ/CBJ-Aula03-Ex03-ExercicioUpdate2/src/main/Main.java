/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import conexao.ConexaoDB;
import static conexao.ConexaoDB.conexao;
import static conexao.ConexaoDB.stmt;
import conexao.SelectQuery;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author tnbrito
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1- Registrar o JDBC
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o id do gerente: ");
        int idgerente = sc.nextInt();
              
        
        try {
            
            ConexaoDB db = new ConexaoDB();
            db.conectarDB();
            
            
            String query1 = "SELECT salario FROM gerentes WHERE id=(?)";
            
            SelectQuery query = new SelectQuery();          
            double salario3 = query.select(query1, idgerente);
            
            // UPDATE
            String query2 = "UPDATE gerentes SET salario=(?) "
                    + "WHERE id=(?)";

            // 4 - configurar a query
            stmt = conexao.prepareStatement(query2);
            stmt.setDouble(1, salario3); //+500
            stmt.setInt(2, idgerente);    //salario
            stmt.executeUpdate();
            System.out.println("Atualizado com sucesso");

            // 5 - fechar o banco de dados.
            stmt.close();
            conexao.close();

        } catch (java.sql.SQLException e) {
            System.err.println("Nao conectou com o banco!");
            System.out.println("Error " + e);
        }

    }
}
