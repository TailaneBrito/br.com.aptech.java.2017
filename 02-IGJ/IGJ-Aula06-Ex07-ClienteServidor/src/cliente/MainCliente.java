/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.sun.xml.internal.ws.developer.ServerSideException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class MainCliente {
    public static void main(String[] args)throws UnknownHostException, IOException
    {
        //configurar o Socket
        Socket cliente = new Socket("192.168.1.60", 2220);
        System.out.println("O Cliente conectou ao servidor: "+cliente.getInetAddress());
        
        //entrada de dados
        Scanner leitor = new Scanner(System.in);
        //saida de dados
        PrintStream saida = new PrintStream(cliente.getOutputStream());
        
        //pegar a temperatura em C
        String tempC;
        System.out.println("Digite a temperatura em C: ");
        tempC = leitor.nextLine();
        
        //enviar a temperatura em C para o servidor
        saida.print(tempC);
        
        //receber a resposta em F
        Scanner entrada = new Scanner(cliente.getInputStream());
        String tempF;
        tempF = entrada.nextLine();
        System.out.println("A temperatura em F é "+tempF);
        
    }
}
