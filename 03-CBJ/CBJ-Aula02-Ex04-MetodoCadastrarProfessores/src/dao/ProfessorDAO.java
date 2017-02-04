/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tnbrito
 */
public class ProfessorDAO {

    
    public void cadastrarProfessor(String nome, int idade, double salario, String materia) throws ClassNotFoundException{
        // 1- Registrar o JDBC
        Class.forName("com.mysql.jdbc.Driver");

        // 2- Conexao com o banco de dados
        String schema = "aula2_escola"; //nome do banco
        String usuario = "root"; //usuario padrao
        String senha = "bancodedados"; //senha do banco de dados da escola
        String local = "jdbc:mysql://localhost/" + schema;

        try {
            Connection conexao = null; //instancia da conexao
            PreparedStatement stmt = null; // instancia da declaracao
            ResultSet rs = null; // instancia do resultado

            conexao = DriverManager.getConnection(local, usuario, senha); //tentando acessar o banco local
            System.out.println("Conectou com o banco de dados!");

            // 3 - Criar query                    nome, idade, nota (o id esta como AI)
            String query = "INSERT INTO professores (nome, idade, salario, materia )"
                    + "     VALUES(?,?,?,?)";

            // 4 - Configurar a query
            stmt = conexao.prepareStatement(query);
            stmt.setString(1, nome); // nome  1, corresponde o primeiro ?
            stmt.setInt(2, idade);          // idade 2, corresponde ao segundo ?
            stmt.setDouble(3, salario);      // salario  3, corresponde ao terceiro ?
            stmt.setString(4, materia);      // materia  4, corresponde ao quarto ?

            // 5 - Executar a query
            stmt.execute();
            System.out.println("Cadastrou o professor com sucesso!!");
            
            // 6 - Fechar o banco
            stmt.close();
            conexao.close();
            System.out.println("Fechou o banco de dados! " + schema);

        } catch (java.sql.SQLException e) {
            //System.err.println("Nao conectou com o banco!");
            System.out.println("Error " + e);
        }

    }
}
