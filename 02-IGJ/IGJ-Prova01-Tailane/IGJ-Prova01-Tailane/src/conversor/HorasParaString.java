/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author tailaneb
 */
public class HorasParaString {

    public static String mensagem, min;
    
    private static final String[] tensNames = {
        "",
        " dez",
        " vinte",
        " trinta",
        " quarenta",
        " cinquenta",
        " sessenta",
        " setenta",
        " oitenta",
        " noventa"
    };

    private static final String[] numNames = {
        "",
        " um",
        " dois",
        " três",
        " quatro",
        " cinco",
        " seis",
        " sete",
        " oito",
        " nove",
        " dez",
        " onze",
        " doze",
        " treze",
        " quatorze",
        " quinze",
        " dezesseis",
        " dezesete",
        " dezoito",
        " dezenove"
    };

    public String horario(int hora, int minuto){
        String mm, hh;
        if (hora > 23 ||  minuto > 59) {
            return "hora inválida";
        }else{
        
        hh = this.converteHoras(hora);    
        mm = this.converteMinutos(minuto);
        
        }
        return hh + " " + mm; 
                
    }
            
    private String converteHoras(int number) {

        if (number == 0) {
            return "Zero horas";
        }

        if (number > 19) {
            if (number == 20 || number == 30 || number == 40 || number == 50) {
                mensagem = tensNames[number / 10] + " e"
                        + numNames[number % 10] + " horas ";
                return mensagem;
            }                  
            
            mensagem = tensNames[number / 10] + " e"
                    + numNames[number % 10] + " horas "  ;
            
            return mensagem;
            
        }     
        else {
            
            if (number == 1) {
                mensagem = "uma hora";
                return mensagem;
            }else if(number == 2){
                mensagem = "duas horas";
                return mensagem;
            }else{
            mensagem = numNames[number] + " horas";
            return mensagem;
            }
        }
        
        
    }
    
    private String converteMinutos(int number) {

        if (number == 0) {
            return "";
        }

        if (number > 19) {
            if (number == 20 || number == 30 || number == 40 || number == 50) {
                min = "e" + tensNames[number / 10] + " e"
                        + numNames[number % 10] + " minutos ";
                return min;
            }
            min = "e" + tensNames[number / 10] + " e"
                    + numNames[number % 10] + " minutos"  ;
            return min;
            
        }     
        else {
            if (number == 1) {
                mensagem = "e" + numNames[number] + " minuto";
                return mensagem;
            }else{
            min = numNames[number] + " minutos";
            return "e" + min;
            }
        }
        
        
    }
}
