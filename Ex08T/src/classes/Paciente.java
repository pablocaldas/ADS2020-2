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
public class Paciente {

    //ATRIBUTOS
    private String nome = "";
    private float peso = 0;
    private float altura = 0;

    //METODOS
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) throws Exception {
        if (peso <= 0) {
            throw new Exception("PESO NÃO PODE SER MENOR OU IGUAL A ZERO.");
        }
        this.peso = peso;
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
    public void setAltura(float altura) throws Exception {
        if (altura <= 0) {
            throw new Exception("ALTURA NÃO PODE SER MENOR OU IGUAL A ZERO.");
        }
        this.altura = altura;
    }

    public float calcularImc() {
        return (peso / (altura * altura));
    }

    public String calcularFaixaPeso(float imc) {
        if (imc < 20) {
            return "ABAIXO DO PESO IDEAL";
        } else if (imc < 25) {
            return "PESO NORMAL";
        } else if (imc < 30) {
            return "EXCESSO DE PESO";
        } else if (imc < 35) {
            return "OBESIDADE";
        } else {
            return "OBESIDADE MÓRBIDA";
        }
    }
}
