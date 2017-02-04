/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tnbrito
 */
public class ConexaoDB {
    public static boolean con;
    public static Connection conexao;
    public static PreparedStatement stmt;
    public static ResultSet rs;
    
    public void conectarDB() throws ClassNotFoundException{
    Class.forName("com.mysql.jdbc.Driver");

        
        String schema = "aula3_funcionarios"; //nome do banco
        String usuario = "root"; //usuario padrao
        String senha = "bancodedados"; //senha do banco de dados da escola
        String local = "jdbc:mysql://localhost/" + schema;
    
        try {
            conexao = null; //instancia da conexao
            stmt = null; // instancia da declaracao
            rs = null; // instancia do resultado

            conexao = DriverManager.getConnection(local, usuario, senha); //tentando acessar o banco local
            
            conexao = DriverManager.getConnection(local, usuario, senha); //tentando acessar o banco local
            con = true;
            System.out.println("Conectado com o DB...");
            
        } catch (java.sql.SQLException e) {
            System.err.println("Nao conectou com o banco!");
            System.out.println("Error " + e);
        }    
    }
    
    
    public void fecharDB() throws SQLException{
            stmt.close();
            conexao.close();
    
    }
    
    
    
    
}
