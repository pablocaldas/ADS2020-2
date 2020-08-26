/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author PabloHenrique
 */
public class Pessoa {

    private String nome = "";
    private int peso = 0;
    private float altura = 0;

    //gets
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    //sets
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularIMC() {
        return (peso / (altura * altura));
    }

}
