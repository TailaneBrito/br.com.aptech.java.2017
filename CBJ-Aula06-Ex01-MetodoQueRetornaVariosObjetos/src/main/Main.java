/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.SerieDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Serie;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        SerieDAO s1 = new SerieDAO();
        ArrayList listaSeries = new ArrayList();
        double nota2 = 10.0;
        
        listaSeries = s1.consultarSeriePelaNota(nota2);
        
        //mostrar todo o conteudo da lista
        for (int i = 0; i < listaSeries.size(); i++) {
            Serie s2 = new Serie();
            s2 = (Serie) listaSeries.get(i); //pegando os objetos da lista
            System.out.println("Serie numero "+i);
            System.out.println("id...........: "+s2.id);
            System.out.println("nome.........: "+s2.nome);
            System.out.println("temporadas...: "+s2.temporadas);
            System.out.println("nota.........: "+s2.nota);
             System.out.println("====================");
        }
        
    }
}
