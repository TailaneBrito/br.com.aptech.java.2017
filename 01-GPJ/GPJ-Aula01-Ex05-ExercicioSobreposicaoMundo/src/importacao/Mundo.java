/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importacao;

/**
 *
 * @author Aluno
 */
public class Mundo {
    public double taxaImportacao(double valor){
        return valor + 200;
    }
    
    public double taxaExportacao(double valor){
        return (valor * 0.10) + valor;
    }
}
