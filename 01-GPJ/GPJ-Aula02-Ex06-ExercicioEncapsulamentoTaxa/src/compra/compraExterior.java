/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compra;

/**
 *
 * @author Aluno
 */
public class compraExterior {
    
    
    public double taxaFinal(double valor){
        //return this.taxaImportacao(this.taxaFrete(this.taxaSeguro(valor)));
         
        double txImportacao = this.taxaImportacao(valor);
        double txFrete = this.taxaFrete(txImportacao);
        double txSeguro = this.taxaSeguro(txFrete);
        
        return txSeguro;
    }
    
    private double taxaImportacao(double valor){
        double taxa = valor + (valor * 0.2);
        return taxa;
    }
    
    private double taxaFrete(double valor){
        double taxa = valor + 35;
        return taxa;
    }
    
    private double taxaSeguro(double valor){
        double taxa = valor + (valor * 0.05);
        return taxa;
    }
}
