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
import java.sql.SQLException;
import model.Animal;

/**
 *
 * @author Aluno
 */
public class AnimalDAO {
    Animal a1 = new Animal();
    
    public Animal concultarAnimalPeloID(int id2) throws ClassNotFoundException, SQLException {
        // 1- Registrar o JDBC
        Class.forName("com.mysql.jdbc.Driver");

        // 2- Conexao com o banco de dados
        String schema = "aula4_veterinario"; //nome do banco
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
    
    public Animal cadastrar(Animal a1) throws ClassNotFoundException{
         // 1- Registrar o JDBC
        Class.forName("com.mysql.jdbc.Driver");

        // 2- Conexao com o banco de dados
        String schema = "aula4_veterinario"; //nome do banco
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
            String query = "INSERT INTO animal (nome, raca, idade )VALUES(?,?,?)";

            // 4 - Configurar a query
            stmt = conexao.prepareStatement(query);
            stmt.setString(1, a1.nome); // nome  1, corresponde o primeiro ?
            stmt.setString(2, a1.raca);          // idade 2, corresponde ao segundo ?
            stmt.setInt(3, a1.idade);      // nota  3, corresponde ao terceiro ?

            // 5 - Executar a query
            stmt.execute();
            System.out.println("Cadastrou o aluno com sucesso!!");
            
            // 6 - Fechar o banco
            stmt.close();
            conexao.close();
            System.out.println("Fecho o banco de dados! " + schema);

        } catch (java.sql.SQLException e) {
            //System.err.println("Nao conectou com o banco!");
            System.out.println("Error " + e);
        }
        
        return a1;
    
    }
    
    
}
