/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        String data = "08/10/2016";
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                
        Date d = formato.parse(data);
        System.out.println(d);
        
        
    
    }

}
