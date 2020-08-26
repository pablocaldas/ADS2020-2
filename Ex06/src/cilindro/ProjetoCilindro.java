/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cilindro;

import javax.swing.JOptionPane;

/**
 *
 * @author PabloHenrique
 */
public class ProjetoCilindro {

    public static void main(String[] args) {
        //CRIANDO OBJETO
        Cilindro cilindro = new Cilindro();

        //ENTRADA DE DADOS
        String input = "";
        input = JOptionPane.showInputDialog("Raio do CILINDRO:");
        cilindro.setRaio(Float.parseFloat(input));
        input = JOptionPane.showInputDialog("Altura:");
        cilindro.setAltura(Float.parseFloat(input));

        //SAIDA DE DADOS
        String output = "";
        output = "DADOS DO CILINDRO:\n"
                + "Área Lateral: " + cilindro.calcularAreaLateral() + "\n"
                + "Área Total: " + cilindro.calcularAreaTotal() + "\n"
                + "Volume: " + cilindro.calcularVolume() + "\n";

        //Imprime o output na tela
        JOptionPane.showMessageDialog(null, output);
    }
}
