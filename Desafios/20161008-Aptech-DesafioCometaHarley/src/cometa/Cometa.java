/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cometa;

/**
 *
 * @author tailaneb
 */
public class Cometa {

    private int anoBase = 1986;
    private int cont = 0;
    private int ano = 0;
    private long res = 0;

    public Cometa(int ano) {
        setAno(ano);
        //calculaCometa();

    }

    private void setAno(int ano) {
        this.ano = ano;
    }

    private int getAno() {
        return this.ano;
    }

    public int calculaCometa() {
        if (getAno() >= this.anoBase) {
            for (int i = this.anoBase; i < getAno(); i += 76) {
                this.cont++;
                this.res = this.anoBase + (this.cont * 76);

            }
        } else {
            for (int i = this.anoBase; i > getAno(); i -= 76) {
                cont++;
                this.res = this.anoBase - ((this.cont - 1) * 76);
            }
        }

        return (int) this.res;
        

    }

}
