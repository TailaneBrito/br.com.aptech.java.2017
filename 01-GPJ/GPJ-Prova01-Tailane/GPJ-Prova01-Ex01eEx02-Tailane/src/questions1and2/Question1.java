/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions1and2;

import java.util.ArrayList;
import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

/**
 *
 * @author tailaneb
 */
public class Question1 {
    public static void main(String[] args)
    {
        /**
         * 6. Corrigir o código acima para executar e 
         * exibir os nomes das pessoas. 
         * Comentar as alterações realizadas.(1.0)
         */
        
        /**
         * 7. Adicionar mais 3 nomes de pessoas e exibir 
         * novamente os nomes em letra maiúscula.(1.0)
         */
        
        /*
        PS: o código original do exercício será exibido em
        comentários de uma linha e logo abaixo as 
        alterações de correção também comentadas em bloco.
        */
        
        /*é preciso adicionar a classe ArrayList do pacote
          java.util  
        */
        //List nomes_pessoas = null;    
        
        ArrayList nomes_pessoas = new ArrayList();
        
        /*é preciso fazer referencia do nome do objeto 
            corretamente
        */
        //        nomes.add("Manoel");
        //        nomes.add("José");
        //        nomes.add("Ana");
        //        nomes.add("Beatriz");
        
        nomes_pessoas.add("Manoel");
        nomes_pessoas.add("José");
        nomes_pessoas.add("Ana");
        nomes_pessoas.add("Beatriz");
        
        /*Adicionando mais 3 nomes ao array
          segundo o ex. 7  
        */
        nomes_pessoas.add("Tailane");
        nomes_pessoas.add("Felipe");
        nomes_pessoas.add("Duda");
        
        int i;
        
        /* a comparação feita pela variável i ao tamanho total
           do ArrayList nomes_pessoas está errada. Nesse caso 
           usamos o size() e nao o length().
        */
        //        for (i = 0; i < nomes_pessoas.length(); i++) {
        //            System.out.println(nomes_pessoas.get(i));
        //        }
        
        /* para mostrar os nomes na lista em maiúsculo é preciso
           converter cada item do array para uma string e chamar o
           método toUppercase() para aquela string.
        */
        
        for (i = 0; i < nomes_pessoas.size(); i++) {
            String nomes = nomes_pessoas.get(i).toString();
            String maiuscula = nomes.toUpperCase();
            System.out.println(maiuscula);
        }
        
        
        
        
    }
}
