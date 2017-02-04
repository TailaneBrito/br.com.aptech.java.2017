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
        String local = "jdbc:mysql://localhost/" + schema;

        try {
            Connection conexao = null; //instancia da conexao
            PreparedStatement stmt = null; // instancia da declaracao
            ResultSet rs = null; // instancia do resultado

            conexao = DriverManager.getConnection(local, usuario, senha); //tentando acessar o banco local
            System.out.println("Conectou com o banco de dados!");

            // 3 - Criar query
            String query = "SELECT * FROM alunos WHERE id = (?)";

            // 4 - Configurar a query
            stmt = conexao.prepareStatement(query);
            stmt.setInt(1, 4); //consulta do aluno 4

            // 5 - Executar a query
            rs = stmt.executeQuery();
            int id2;
            int idade2 = 0;
            String nome2 = null;
            double nota2 = 0;

            while (rs.next()) { //esse loop retorna todo os valores para aquela busca
                id2 = rs.getInt("id");
                nome2 = rs.getString("nome");
                idade2 = rs.getInt("idade");
                nota2 = rs.getDouble("nota");
            }

            // 6 - Processar os resultados
            System.out.println("NOME....: " + nome2);
            System.out.println("IDADE...: " + idade2);
            System.out.println("NOTA....: " + nota2);

        } catch (java.sql.SQLException e) {
            System.err.println("Nao conectou com o banco!");
            System.out.println("Error " + e);
        }

    }
}
