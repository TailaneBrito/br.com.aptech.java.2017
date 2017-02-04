/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import static conexao.ConexaoDB.conexao;
import static conexao.ConexaoDB.stmt;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class UpdateQuery {
    
    public void alterar(int idgerente) throws SQLException {
        String query2 = "UPDATE gerentes SET setor=(?) "
                    + "WHERE salario > (?) AND id=(?)";
        
        stmt = conexao.prepareStatement(query2);
        stmt.setString(1, "CENTRO"); //setor
        stmt.setDouble(2, 5000);    //salario
        stmt.setInt(3, idgerente);    //id gerente
        stmt.executeUpdate();
        System.out.println("Atualizado com sucesso!");

    }
}
