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
 public class Funcionario {

    // ATRIBUTOS
    private String nome = "";
    private float salario = 0;
    private int filhos = 0;

    //METODOS
    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public int getFilhos() {
        return filhos;
    }
    
    public void setNome(String nome) throws Exception {
        if (nome.trim().length() < 2) {
            throw new Exception("Nome inválido");
        }
        this.nome = nome;
    }

    public void setSalario(float salario) throws Exception {
        if (salario < 0) {
            throw new Exception("Salário não pode ser < 0");
        }
        this.salario = salario;
    }

    public void setFilhos(int filhos) throws Exception {
        if (filhos < 0) {
            throw new Exception("Quantidade de filhos não pode ser < 0");
        }
        this.filhos = filhos;
    }

    // CALCULOS
    public float getAumentoSalarial(float percent) throws Exception {
        if (percent <= 0) {
            throw new Exception("Percentual de aumento não pode ser <= 0");
        }
        return (salario * (percent / 100));
    }

    public float getInssAliquota() {
        if (salario <= (float) 2545) {
            return (float) 6;
        } else {
            return (float) 10;
        }
    }

    public float getInssValor() {
        return (float) (salario * (getInssAliquota() / 100));
    }

    public float getIrAliquota() {
        if (salario < (float) 1903.99) {
            return 0;
        } else if (salario < (float) 2826.66) {
            return (float) 7.5;
        } else if (salario < (float) 3751.06) {
            return (float) 15;
        } else if (salario < (float) 4664.68) {
            return (float) 22.5;
        } else {
            return (float) 27.5;
        }
    }

    public float getIrParcela() {
        return (float) (salario * (getIrAliquota() / 100));
    }

    public float getIrValorMensal() throws Exception {
        float valor = (float) (getIrParcela() - (filhos * 545));
        if (valor < 0) {
        }
        return valor;
    }
}