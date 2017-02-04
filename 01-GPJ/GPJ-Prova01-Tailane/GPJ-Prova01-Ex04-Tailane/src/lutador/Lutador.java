/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lutador;

/**
 *
 * @author tailaneb
 */
public class Lutador {

    public void combo1() {
        System.out.println("Combo1");
        this.chute();
        this.chute();
        this.soco();
    }

    public void combo2() {
        System.out.println("Combo2");
        this.soco();
        this.soco();
        this.chute();
    }

    public void combo3() {
        System.out.println("Combo3");
        this.chute();
        this.soco();
        this.chute();
        this.soco();
    }

    private void soco() {
        System.out.println("Soc!");
    }

    private void chute() {
        System.out.println("Pow!");
    }
}
