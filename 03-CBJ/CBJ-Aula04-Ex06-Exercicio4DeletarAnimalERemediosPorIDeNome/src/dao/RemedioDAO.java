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
import javax.swing.JOptionPane;
import model.Remedio;

/**
 *
 * @author tnbrito
 */
public class RemedioDAO {
    Remedio r1 = new Remedio();
    
    public Remedio cadastrar(Remedio r1) throws ClassNotFoundException {
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
            String query = "INSERT INTO remedio (nome, dosagem_ml)VALUES(?,?)";

            // 4 - Configurar a query
            stmt = conexao.prepareStatement(query);
            stmt.setString(1, r1.nome); // nome  1, corresponde o primeiro ?
            stmt.setDouble(2, r1.dosagem);          // idade 2, corresponde ao segundo ?

            // 5 - Executar a query
            stmt.execute();
            

            // 6 - Fechar o banco
            stmt.close();
            conexao.close();
            

        } catch (java.sql.SQLException e) {
            //System.err.println("Nao conectou com o banco!");
            System.out.println("Error " + e);
        }

        return r1;

    }
    
    public Remedio consultar(int id2) throws ClassNotFoundException, SQLException {
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
            String query = "SELECT * FROM remedio WHERE id = (?)";

            // 4 - Configurar a query
            stmt = conexao.prepareStatement(query);
            stmt.setInt(1, id2); //consulta id

            // 5 - Executar a query
            rs = stmt.executeQuery();

            while (rs.next()) { //esse loop retorna todo os valores para aquela busca
                r1.id = rs.getInt("id");
                r1.nome = rs.getString("nome");
                r1.dosagem = rs.getDouble("dosagem_ml");
            }

            stmt.close();
            conexao.close();

        } catch (java.sql.SQLException e) {
            System.err.println("Nao conectou com o banco!");
            System.out.println("Error " + e);
        }

        return r1;
    }
    
    public void deletar(String nome1) throws ClassNotFoundException {

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
            String query = "DELETE FROM remedio WHERE nome = (?)";

            // 4 - Configurar a query
            stmt = conexao.prepareStatement(query);
            stmt.setString(1, nome1); //id igual a 3

            int valor2 = JOptionPane.showConfirmDialog(null, "Tem certeza?", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION);
            System.out.println(valor2);
            
            if (valor2==0) {
                stmt.execute();
            }

            // 6 - Fechar o banco
            stmt.close();
            conexao.close();

        } catch (java.sql.SQLException e) {
            //System.err.println("Nao conectou com o banco!");
            System.out.println("Error " + e);
        }

    }
    
    
}
