/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class SelectQuery {

    public double select(String query, int id) throws SQLException {
        String query1;

        ConexaoDB.stmt = ConexaoDB.conexao.prepareStatement(query);
        int idgerente;
        ConexaoDB.stmt.setInt(1, id); //consulta id do gerente

        ConexaoDB.rs = ConexaoDB.stmt.executeQuery();

        double salario2 = 0;
        while (ConexaoDB.rs.next()) { //esse loop retorna todo os valores para aquela busca
            salario2 = ConexaoDB.rs.getDouble("salario");
        }

        //AUMENTA O SALARIO
        return salario2; 

    }
}
