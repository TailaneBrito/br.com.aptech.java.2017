/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tailaneb
 */
public class Main {
    public static void main(String[] args) {
        int anoBase = 1986;
        int cont=0;
        int ano = 1833;
        long res=0;
        
        if (ano >= anoBase ) {
          for (int i = anoBase; i < ano; i+=76) {
            cont++;
            res = anoBase+(cont*76);
                         
            }  
        }else{
            for (int i = anoBase; i > ano; i-=76) {
            cont++;
            res = anoBase-((cont-1)*76);
            }
        }
        
        System.out.println("SAÍDA " + res);
        //System.out.println("cont " + cont);
        
      
    }
}
