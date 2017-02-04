package dao;

import static conexao.ConexaoDB.*;
import java.sql.SQLException;
import java.util.Scanner;
import static main.Main.idvendedor;

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
