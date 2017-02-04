/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    public String nome;
    public double carteira;

    /**
     *
     */
    public static double contaConjunta;
    
    
    public void saca(double valorSaque){
        Pessoa.contaConjunta -= valorSaque;
        System.out.println("Saque " + this.contaConjunta);
    }
    
    public void deposita(double valorDesposito){
        Pessoa.contaConjunta += valorDesposito;
        System.out.println("Deposito final: " + this.contaConjunta);
    }
    
    
}
