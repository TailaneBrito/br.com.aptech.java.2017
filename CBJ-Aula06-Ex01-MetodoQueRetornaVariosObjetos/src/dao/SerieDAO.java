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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Serie;

/**
 *
 * @author tnbrito
 */
public class SerieDAO {
    //2 - preparando conexao com banco de dados
    private final String SCHEMA = "aula5_filmes";
    private final String CAMINHO = "jdbc:mysql://localhost/"+SCHEMA;
    private final String USUARIO_BD = "root";
    private final String SENHA_BD = "bancodedados";
    
    //QUERYS==========================================================
    private final String CONSULTAR_SERIES_PELA_NOTA = "SELECT * FROM series WHERE nota >= (?)";
    
    //QUERYS==========================================================
    
    private static Connection conexao = null;
    private static PreparedStatement stmt = null;
    private static ResultSet rs = null;
    
    //construtor ->ALT+INSERT

    public SerieDAO() throws ClassNotFoundException {
        //registrar o drive JDBC
        Class.forName("com.mysql.jdbc.Driver");
        
    }
    
    //o metodo abaixo vai retornar um arraylist de objetos do tipo Serie
    public ArrayList consultarSeriePelaNota(double nota) throws SQLException{
        //1 - conexao com banco de dados
        conexao = DriverManager.getConnection(CAMINHO, USUARIO_BD, SENHA_BD); 
        System.out.println("Conectou com o banco " + SCHEMA);
        
        //2 - preparar a query
        String query = CONSULTAR_SERIES_PELA_NOTA;
        stmt = conexao.prepareStatement(query);
        
        //SELECT * FROM series WHERE nota >= (?);
        stmt.setDouble(1, nota);
                
        //3 - executar a query
        rs = stmt.executeQuery();
        
        ArrayList lista = new ArrayList();
        while(rs.next()){
            
            //carrega o objeto
            Serie s1 = new Serie();
            
            s1.id = rs.getInt("id");
            s1.nome = rs.getString("nome");
            s1.temporadas = rs.getInt("temporadas");
            s1.nota = rs.getDouble("nota");
           
            //insere o objeto na lista
            lista.add(s1);
        }
        
        //4 - fechar o BD
        stmt.close();
        conexao.close();
        
        return lista;
    }
    
}
