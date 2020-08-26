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
public class Eleitor {

    //VARIAVEIS
    private String nome = "";
    private int anoAtual = 2020;
    private int anoNacimento = 0;

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
     * @return the ano
     */
    public int getAnoAtual() {
        return anoAtual;
    }

    /**
     * @param ano the ano to set
     */
    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    /**
     * @return the anoNacimento
     */
    public int getAnoNacimento() {
        return anoNacimento;
    }

    /**
     * @param anoNacimento the anoNacimento to set
     */
    public void setAnoNacimento(int anoNacimento) throws Exception {
        if (anoNacimento > anoAtual) {
            throw new Exception("O ANO DE NACIMENTO NÃO PODE SER MAIOR QUE " + anoAtual + ".");
        }
        if (anoNacimento < 0) {
            throw new Exception("ANO DE NASCIMENTO NÃO PODE SER NEGATIVO.");
        }
    }

    public String tipoEleitor() {
        int idade = anoAtual - anoNacimento;
        if (idade < 16) {
            return "Não Eleitor";
        } else if (idade <= 16 && idade < 18) {
            return "Eleitor Facultativo";
        } else if (idade >= 18 && idade <= 65) {
            return "Eleitor Obrigatório";
        } else {
            return "Eleitor Facultativo";
        }
    }
}
