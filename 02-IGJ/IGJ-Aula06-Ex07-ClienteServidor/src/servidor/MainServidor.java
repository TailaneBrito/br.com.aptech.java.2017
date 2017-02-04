/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class MainServidor {
    public static void main(String[] args) throws IOException {
        //configurar o servidor
        ServerSocket servidor = new ServerSocket(2220);
        System.out.println("A porta foi aberta");
       
        while(true)
        {
        //cliente conecta
        Socket cliente = servidor.accept();
        System.out.println("Conexão com "+cliente.getInetAddress()); 
        
        //entrada de dados
        Scanner leitor_s = new Scanner(cliente.getInputStream()); 
        //saida de dados
        PrintStream saida = new PrintStream(cliente.getOutputStream());
        
        //conversão da temperatuda
            while(leitor_s.hasNext())
            {
                String tempC;
                tempC = leitor_s.nextLine();
                System.out.println("Temperatura Fornecida é "+tempC);
                
                //converter para double
                double valorC = Double.valueOf(tempC);
                
                //converter para F
                double valorF = valorC * 1.8 +32;
                
                //converter para String
                String tempF = String.valueOf(valorF);
                
                //enviar para o cliente o valor convertido
                saida.print(tempF);
            }
           
            leitor_s.close();
            cliente.close();
            
        }
    }    
        
}
