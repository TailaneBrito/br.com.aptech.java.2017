/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tnbrito
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1- Registrar o JDBC
        Class.forName("com.mysql.jdbc.Driver");
        
        
        // 2- Conexao com o banco de dados
        String schema = "aula2_escola"; //nome do banco
        String usuario = "root"; //usuario padrao
        String senha = "bancodedados"; //senha do banco de dados da escola
        String local = "jdbc:mysql://localhost/"+schema;
        
        try{
        Connection conexao = null; //instancia da conexao
        PreparedStatement stmt = null; // instancia da declaracao
        ResultSet rs = null; // instancia do resultado
        
        // 3 - conexao com o banco de dados
        conexao = DriverManager.getConnection(local, usuario, senha); //tentando acessar o banco local
        System.out.println("Conectou com o banco de dados!");
        
        }catch(java.sql.SQLException e){
            System.err.println("Nao conectou com o banco!");
            System.out.println("Error " + e);
        }
        
       
        
    }
}
