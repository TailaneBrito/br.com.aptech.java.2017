/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Animal;

/**
 *
 * @author Aluno
 */
public class AnimalDAO {
    public Animal concultarAnimalPeloID(int id2) throws ClassNotFoundException{
        // 1- Registrar o JDBC
        Class.forName("com.mysql.jdbc.Driver");

        // 2- Conexao com o banco de dados
        String schema = "aula4_veterinario"; //nome do banco
        String usuario = "root"; //usuario padrao
        String senha = "bancodedados"; //senha do banco de dados da escola
        String local = "jdbc:mysql://localhost/" + schema;
        
        Animal a1 = new Animal();
        
        try {
            Connection conexao = null; //instancia da conexao
            PreparedStatement stmt = null; // instancia da declaracao
            ResultSet rs = null; // instancia do resultado

            conexao = DriverManager.getConnection(local, usuario, senha); //tentando acessar o banco local
            System.out.println("Conectou com o banco de dados!");

            // 3 - Criar query
            String query = "SELECT * FROM animal WHERE id = (?)";

            // 4 - Configurar a query
            stmt = conexao.prepareStatement(query);
            stmt.setInt(1, id2); //consulta id

            // 5 - Executar a query
            rs = stmt.executeQuery();
            
            while (rs.next()) { //esse loop retorna todo os valores para aquela busca
                a1.id = rs.getInt("id");
                a1.nome = rs.getString("nome");
                a1.raca = rs.getString("raca");
                a1.idade = rs.getInt("idade");
            }
            
            stmt.close();
            conexao.close();
            
            
        } catch (java.sql.SQLException e) {
            System.err.println("Nao conectou com o banco!");
            System.out.println("Error " + e);
        }
        
        return a1;
    }
}
