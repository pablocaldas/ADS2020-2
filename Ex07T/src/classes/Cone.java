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
public class Cone {

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
    public void setRaio(float raio) throws Exception {
        if (raio <= 0) {
            throw new Exception("RAIO NÃO PODE SER MENOR OU IGUAL A ZERO.");
        }
        this.raio = raio;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) throws Exception {
        if (altura <= 0) {
            throw new Exception("ALTURA NÃO PODE SER MENOR OU IGUAL A ZERO.");
        }
        this.altura = altura;
    }

    //CALCULOS
    public float calcularGiretriz() {
        return (float) (Math.sqrt((altura * altura) + (raio * raio)));
    }

    public float calcularAreaLateral() {
        return (float) (3.1415 * raio * calcularGiretriz());
    }

    public float calcularAreaTotal() {
        return (float) (3.1415 * raio * calcularGiretriz() + raio);
    }

    public float calcularVolume() {
        return (float) (1.0 / 3.0 * 3.1415 * (raio * raio) * altura);
    }
}
