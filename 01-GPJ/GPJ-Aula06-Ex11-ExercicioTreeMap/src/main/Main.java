/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.TreeMap;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        TreeMap ctrl_de_ips = new TreeMap();
        
        ctrl_de_ips.put("200.201.10.45", "www.uol.com.br");
        ctrl_de_ips.put("178.890.0.1", "www.globo.com");
        ctrl_de_ips.put("0.0.12.123", "www.google.com");
        ctrl_de_ips.put("200.202.0.4", "www.aptech.com.br");
        ctrl_de_ips.put("189.890.0.1", "www.prefeitura.sp.gov.br");
        
        System.out.println("1.Retornar o elemento referente ao IP 0.012.123");
        System.out.println(ctrl_de_ips.get("0.0.12.123"));
        
        System.out.println("2.Exibir todas as chaves do HashMap");
        System.out.println(ctrl_de_ips.keySet());
        
        System.out.println("3.Excluir o IP 189.890.0.1");
        System.out.println(ctrl_de_ips.remove("189.890.0.1"));
        System.out.println(ctrl_de_ips.keySet());
        
    }
}
