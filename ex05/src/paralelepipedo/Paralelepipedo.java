/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paralelepipedo;

/**
 *
 * @author PabloHenrique
 */
public class Paralelepipedo {

    //Atributos
    private float altura = 0;
    private float largura = 0;
    private float comprimento = 0;

    //GET'S
    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @return the largura
     */
    public float getLargura() {
        return largura;
    }

    /**
     * @return the comprimento
     */
    public float getComprimento() {
        return comprimento;
    }

    //SET'S
    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(float largura) {
        this.largura = largura;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    //CALCULOS
    public float calcularVolume() {
        return (float) altura * comprimento * largura;
    }

    public float calcularArea() {
        return (float) (2 * (altura * largura) + (altura * comprimento) + (largura * comprimento));
    }
}
