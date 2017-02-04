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
import model.Filme;

/**
 *
 * @author tnbrito
 */
public class FilmeDAO {
    //2 - preparando conexao com banco de dados
    private final String SCHEMA = "aula5_filmes";
    private final String CAMINHO = "jdbc:mysql://localhost/"+SCHEMA;
    private final String USUARIO_BD = "root";
    private final String SENHA_BD = "bancodedados";
    
    //QUERYS==========================================================
    private final String CADASTRAR_NOVO_FILME = "INSERT INTO filmes (nome,genero,ano,nota) VALUES(?,?,?,?)";
    private final String DELETAR_FILME_PELO_ID = "DELETE FROM filmes WHERE id=(?)";
    private final String ATUALIZAR_NOTA_PELO_ID = "UPDATE filmes SET nota=(?) WHERE id=(?)";
    private final String CONSULTAR_NOME_E_GENERO_PELO_ID = "SELECT nome, genero FROM filmes WHERE id=(?)";
    private final String CONSULTAR_TUDO_PELO_ID = "SELECT * FROM filmes WHERE id=(?)";
    private final String AUMENTAR_NOTA_EM_1_PONTO_DADO_PELO_ID = "";
        private final String PEGAR_NOTA = "SELECT nota FROM filmes WHERE id=(?)";
        private final String AUMENTAR_NOTA = "UPDATE filmes SET nota=(?) WHERE id=(?)";
    
    
    //QUERYS==========================================================
    
    private static Connection conexao = null;
    private static PreparedStatement stmt = null;
    private static ResultSet rs = null;
    
    //construtor ->ALT+INSERT

    public FilmeDAO() throws ClassNotFoundException {
        //registrar o drive JDBC
        Class.forName("com.mysql.jdbc.Driver");
        
    }
    
    public void cadastrarNovoFilme(Filme f1) throws SQLException{
        //1 - conexao com banco de dados
        conexao = DriverManager.getConnection(CAMINHO, USUARIO_BD, SENHA_BD); 
        System.out.println("Conectou com o banco " + SCHEMA);
        
        //2 - preparar a query
        String query = CADASTRAR_NOVO_FILME;
        stmt = conexao.prepareStatement(query);
        
        //CADASTRAR_NOVO_FILME = "INSERT INTO filmes (nome,genero,ano,nota) VALUES(?,?,?,?)";
        
        stmt.setString(1, f1.nome);
        stmt.setString(2, f1.genero);
        stmt.setInt(3, f1.ano);
        stmt.setDouble(4, f1.nota);
        
        //3 - executar a query
        stmt.execute();
        JOptionPane.showMessageDialog(null, "Filme Cadastrado com sucesso!");
        System.out.println("Filme Cadastrado com sucesso!");
        
        //4 - fechar o BD
        stmt.close();
        conexao.close();
        
    }
    
    public void DeletarFilmePeloId(int id) throws SQLException{
        conexao = DriverManager.getConnection(CAMINHO, USUARIO_BD, SENHA_BD); 
        System.out.println("Conectou com o banco " + SCHEMA);
       
        //2 - preparar a query
        String query = DELETAR_FILME_PELO_ID;
        stmt = conexao.prepareStatement(query);
        
        //"DELETE FROM filmes WHERE id=(?)";
        stmt.setInt(1, id);
        
        //3 - EXECUTAR A QUERY
        stmt.execute();
        JOptionPane.showMessageDialog(null, "Filme " + id + " foi deletado com sucesso!");
        //System.out.println("Filme " + id + " foi deletado com sucesso!");
        
        //4 - fechar o BD
        stmt.close();
        conexao.close();
    }
    
    public void atualizarNotaPeloID(int id, double nota) throws SQLException{
        conexao = DriverManager.getConnection(CAMINHO, USUARIO_BD, SENHA_BD);
        System.out.println("Conectou com o banco " + SCHEMA);
        
        //2 - preparar a query
        String query = ATUALIZAR_NOTA_PELO_ID;
        stmt = conexao.prepareStatement(query);
        
        //UPDATE filmes SET nota=(?) WHERE id=(?)
        stmt.setDouble(1, nota);
        stmt.setInt(2, id);
        
        //3 - executar a query
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Filme " + id + " foi Atualizado com sucesso!");
        
        //4 - fechar o DB
        stmt.close();
        conexao.close();
    
    }
    
    public Filme consultarNomeEGeneroPeloID(int id) throws SQLException{
        Filme f1 = new Filme();
        
        conexao = DriverManager.getConnection(CAMINHO, USUARIO_BD, SENHA_BD);
        System.out.println("Conectou com o banco" + SCHEMA);
        
        //2 - preparar a query
        String query = CONSULTAR_NOME_E_GENERO_PELO_ID;
        stmt = conexao.prepareStatement(query);
        
        //SELECT nome, genero FROM filmes WHERE id=(?)
        
        stmt.setInt(1, id);
        
        // 3 - executar a query
        rs = stmt.executeQuery();
        while (rs.next()) { //esse loop retorna todo os valores para aquela busca
                f1.nome = rs.getString("nome");
                f1.genero = rs.getString("genero");
            }
        
        // 4 - fechar a query
        stmt.close();
        conexao.close();
        System.out.println("fechou o banco");
        return f1;
    }
    
    public Filme consultarTudoPeloId(int id) throws SQLException{
        Filme f1 = new Filme();
        
        conexao = DriverManager.getConnection(CAMINHO, USUARIO_BD, SENHA_BD);
        System.out.println("Conectou com o banco! " + SCHEMA);
        
        //2 - preparando a query
        String query = CONSULTAR_TUDO_PELO_ID;
        stmt = conexao.prepareStatement(query);
        
        //SELECT * FROM filmes WHERE id=(?)
        
        stmt.setInt(1, id);
        
        //3 - executar a query
        rs = stmt.executeQuery();
        while(rs.next()){
            f1.nome = rs.getString("nome");
            f1.genero = rs.getString("genero");
            f1.ano = rs.getInt("ano");
            f1.nota = rs.getDouble("nota");
        }
        
        //4 - fechar o banco
        stmt.close();
        conexao.close();
        
        return f1;
    }
    
    public void aumentarNotaEmUmPontoDadoPeloId(int id) throws SQLException{
        Filme f1 = new Filme();
        
       conexao = DriverManager.getConnection(CAMINHO, USUARIO_BD, SENHA_BD);
        System.out.println("Conectou com o banco! " + SCHEMA);
        
        //2 - preparando a query1 Select
        String query1 = PEGAR_NOTA;
        stmt = conexao.prepareStatement(query1);
        
        //SELECT * FROM filmes WHERE id=(?)
        System.out.println(id);
        stmt.setInt(1, id);
        
        
        //3 - executar a query
        rs = stmt.executeQuery();
        while(rs.next()){
            f1.nota = rs.getDouble("nota");
        }
        
        // acrescentando um na nota
        f1.nota += 1;
        
        //2- preparando a query2 Update
        String query2 = AUMENTAR_NOTA;
        stmt = conexao.prepareStatement(query2);
        
        //UPDATE filmes SET nota=(?) WHERE id=(?)
        stmt.setDouble(1, f1.nota);
        stmt.setInt(2, id);
        
        //3 - executar a query2
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Filme " + id + " foi Atualizado com sucesso!");
        
        //4- fechar o banco
        stmt.close();
        conexao.close();
        
    
    }
    
}
