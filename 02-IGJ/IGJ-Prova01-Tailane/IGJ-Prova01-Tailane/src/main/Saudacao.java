/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Locale;
import java.util.ResourceBundle;
import static main.Main.clicked;

/**
 *
 * @author tailaneb
 */
public class Saudacao {

    public static String mensagem;
    
    
    /* Questao 6
       trocando o texto da labelCaixa1 conforme horario
       digitado em caixa1.
    */
    public String saudar2(int horario) {
        Locale brasil = new Locale("br", "BR");
        ResourceBundle tradBR = ResourceBundle.getBundle("linguas.MessagesBundle", brasil);
        Locale usa = new Locale("us", "US");
        ResourceBundle tradUS = ResourceBundle.getBundle("linguas.MessagesBundle", usa);
        
        
        if (clicked==false) {
            if (horario >= 5 && horario < 11) {
                mensagem = tradUS.getString("msg1_lbl");
            }else if (horario >= 11 && horario < 18) {
                mensagem = tradUS.getString("msg2_lbl");
            }else {
                mensagem = tradUS.getString("msg3_lbl");
            }
            
           
                
  
        } else {
            if (horario >= 5 && horario < 11) {
                mensagem = tradBR.getString("msg1_lbl");
            }else if (horario >= 11 && horario < 18) {
                mensagem = tradBR.getString("msg2_lbl");
            }else {
                mensagem = tradBR.getString("msg3_lbl");
            }
            
            
            //String msg01 = tradUS.getString("msg1_lbl");

            

        }

        return mensagem;
    }

}
