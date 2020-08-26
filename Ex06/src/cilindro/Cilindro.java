/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cilindro;

/**
 *
 * @author PabloHenrique
 */
public class Cilindro {

    //ATRIBUTOS

    private float raio = 0;
    private float altura = 0;

    //GET'S
    /**
     * @return the raio
     */
    public float getRaio() {
        return raio;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }
    //SET'S

    /**
     * @param raio the raio to set
     */
    public void setRaio(float raio) {
        this.raio = raio;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    //CALCULOS
    public float calcularAreaLateral() {
        return (float) (2 * 3.1415 * raio * altura);
    }

    public float calcularAreaTotal() {
        return (float) (2 * 3.1415 * raio * (altura + raio));
    }

    public float calcularVolume() {
        return (float) 3.1415 * raio * raio * altura;
    }
}
