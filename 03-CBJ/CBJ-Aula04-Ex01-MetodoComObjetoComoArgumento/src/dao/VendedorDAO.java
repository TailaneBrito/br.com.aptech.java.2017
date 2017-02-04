package dao;

import static dao.ConexaoDB.conexao;
import static dao.ConexaoDB.stmt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import model.Vendedor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno
 */
public class VendedorDAO {

    public void cadastrarNovoVendedor(Vendedor v1) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        String schema = "aula3_funcionarios"; //nome do banco
        String usuario = "root"; //usuario padrao
        String senha = "bancodedados"; //senha do banco de dados da escola
        String local = "jdbc:mysql://localhost/" + schema;

        try {
            Connection conexao = null; //instancia da conexao
            PreparedStatement stmt = null; // instancia da declaracao
            ResultSet rs = null; // instancia do resultado

            conexao = DriverManager.getConnection(local, usuario, senha); //tentando acessar o banco local

            System.out.println("Conectado com o DB..." + schema);

            String query = "INSERT INTO vendedores (nome, salario, regiao)"
                    + "VALUES (?,?,?)";

            stmt = conexao.prepareStatement(query);
            stmt.setString(1, v1.nome); 
            stmt.setDouble(2, v1.salario);
            stmt.setString(3, v1.regiao); 

            // 5 - Executar a query
            stmt.execute();
            System.out.println("Cadastrou o vendedor com sucesso!!");

            // 6 - Fechar o banco
            stmt.close();
            conexao.close();
            System.out.println("Fecho o banco de dados! " + schema);

        } catch (java.sql.SQLException e) {
            System.err.println("Nao conectou com o banco!");
            System.out.println("Error " + e);
        }

    }

    public void deletarVendedorPorId(int id) throws SQLException {
        Scanner leitor = new Scanner(System.in);

        // 3 - Criar query
        String query = "DELETE FROM vendedores WHERE id = (?)";

        // 4 - Configurar a query
        stmt = conexao.prepareStatement(query);
        stmt.setInt(1, id); //id igual a 3

        //stmt.execute();
        System.out.println("Tem certeza? SIM/NAO");
        String res = leitor.nextLine();

        if (res.equals("SIM") || res.equals("sim")) {
            stmt.execute();
            System.out.println("Deletou da tabela vendedor");
        }

    }
}
