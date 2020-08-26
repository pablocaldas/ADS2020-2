/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

import javax.swing.JOptionPane;

public class ProjetoPessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        //entrada
        String entrada = "";
        entrada = JOptionPane.showInputDialog("Nome Completo:");
        pessoa.setNome(entrada);
        entrada = JOptionPane.showInputDialog("Peso em Quilogramas:");
        pessoa.setPeso(Integer.parseInt(entrada));
        entrada = JOptionPane.showInputDialog("Altura em Metros:");
        pessoa.setAltura(Float.parseFloat(entrada));

        String saida = (String.format("Dados da pessoa\n"
                + "Nome: %.s .\n"
                + "Peso em Quilogramas: %.0f.\n"
                + "Altura em Metros: %.2f.\n"
                + "IMC = %.2f\n",
                pessoa.getNome(),
                pessoa.getPeso(),
                pessoa.getAltura(),
                pessoa.calcularIMC()));

        JOptionPane.showMessageDialog(null, saida);
    }
}
