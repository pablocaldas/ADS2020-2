/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoa;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class ProjetoPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa pablo = new Pessoa();

        //Entrada
        String entrada = "";
        entrada = JOptionPane.showInputDialog("Nome:");
        pablo.setNome(entrada);
        entrada = JOptionPane.showInputDialog("Idade:");
        pablo.setIdade(Integer.parseInt(entrada));
        entrada = JOptionPane.showInputDialog("Sexo:");
        pablo.setSexo(entrada);
        entrada = JOptionPane.showInputDialog("E-mail:");
        pablo.setEmail(entrada);
        entrada = JOptionPane.showInputDialog("Telefone:");
        pablo.setTelefone(Integer.parseInt(entrada));
        entrada = JOptionPane.showInputDialog("CPF:");
        pablo.setCPF(Integer.parseInt(entrada));

        //Saida
        String saida = "Dados da pessoa\n"
                + "Nome: " + pablo.getNome() + ".\n"
                + "Idade: " + pablo.getIdade() + ".\n"
                + "Sexo: " + pablo.getSexo() + ".\n"
                + "e-mail: " + pablo.getEmail() + "\n"
                + "Telefone: " + pablo.getTelefone() + ".\n"
                + "CPF: " + pablo.getCPF() + ".\n";

        JOptionPane.showMessageDialog(null, saida);

    }

}
