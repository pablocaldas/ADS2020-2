/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esfera;

/**
 *
 * @author PabloHenrique
 */
public class Esfera {

    //Atributos
    private float raio = 0;

    //GET
    /**
     * @return the raio
     */
    public float getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    //SET
    public void setRaio(float raio) {
        this.raio = raio;
    }

    //Calculos

    public float calcularArea() {
        return (float) (4 * 3.1415 * raio * raio);
    }

    public float calcularVolume() {
        return (float) ((4.0 / 3.0) * 3.1415 * raio * raio * raio);
    }
}
