/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import animais.*;
/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
    Lebre lebre = new Lebre();
    Tartaruga tartaruga = new Tartaruga();
    
    Thread tread1 = new Thread(lebre);
    Thread tread2 = new Thread(tartaruga);
    
    System.out.println("Comecou a corrida");
    tread1.start();
    tread2.start();
    
    }        
}
