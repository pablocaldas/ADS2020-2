/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author PabloHenrique
 */
public class Retangulo {

    //Atributos
    private float comprimento = 0;
    private float largura = 0;

    //GETS
    /**
     * @return the comprimento
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     * @return the largura
     */
    public float getLargura() {
        return largura;
    }

    //SETS
    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(float comprimento) throws Exception {
        if (comprimento <= 0) {
            throw new Exception("COMPRIMENTO NÃO PODE SER MENOR OU IGUAL A ZERO.");
        }
        this.comprimento = comprimento;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(float largura) throws Exception {
        if (largura <= 0) {
            throw new Exception("LARGURA NÃO PODE SER MENOR OU IGUAL A ZERO.");
        }
        this.largura = largura;
    }

    //CALCULOS
    //PERIMETRO
    public float calcularPerimetro() {
        return ((largura + comprimento) * 2);
    }

    //AREA
    public float calcularArea() {
        return (largura * comprimento);
    }
}
