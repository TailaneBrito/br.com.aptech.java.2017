/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Aluno
 */
public class Cachorro {
    public String nome;
    public int idade;
    public String raca;
    
    public void verificadorIdade(int idade){
        if (idade > 10) {
            System.out.println("Cachorro velho");
        }else{
            System.out.println("Cachorro novo");
        }
    }
}
