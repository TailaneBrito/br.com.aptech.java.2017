package dao;

import static dao.ConexaoDB.conexao;
import static dao.ConexaoDB.stmt;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno
 */
public class GerenteDAO {
    public int id;
    public static String nome;
    public static double salario;
    public static String setor;
    
    
    public void deletarGerentePorSalario(double salario) throws SQLException {
        Scanner leitor = new Scanner(System.in);
        
        // 3 - Criar query
        String query = "DELETE FROM gerentes WHERE salario > (?)";

        // 4 - Configurar a query
        stmt = conexao.prepareStatement(query);
        stmt.setDouble(1, salario); //id igual a 3
        
               
        System.out.println("Tem certeza? SIM/NAO");
        String res = leitor.nextLine();
        
        if (res.equals("SIM") || res.equals("sim")) {
            stmt.execute();
            System.out.println("Deletou da tabela gerentes");
        }
        

        

    }
}
