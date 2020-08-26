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
public class Piramide {

    //ATRIBUTOS

    private float base = 0;
    private float altura = 0;

    //METODOS
    /**
     * @return the base
     */
    public float getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(float base)throws Exception{
        if(base <=0)
            throw new Exception("BASE NÃO PODE SER MENOR OU IGUAL A ZERO.");
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
    public void setAltura(float altura)throws Exception{
        if (altura<=0)
            throw new Exception("ALTURA NÃO PODE SER MENOR OU IGUAL A ZERO.");
        this.altura = altura;
    }

    public float calcularVolume() {
        return (float) (1.0 / 3.0 * base * altura);
    }

}
