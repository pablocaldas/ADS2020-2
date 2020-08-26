/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramide;

/**
 *
 * @author PabloHenrique
 */
public class Piramide {

    //Atributos
    private float base = 0;
    private float altura = 0;

    //Metodos
    /**
     * @return the base
     */
    public float getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularVolume() {
        float valor = (float)(1.0 / 3.0 * base * altura);
        return valor;
    }
}
