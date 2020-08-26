/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cone;

import javax.swing.JOptionPane;

/**
 *
 * @author PabloHenrique
 */
public class ProjetoCone {

    public static void main(String[] args) {
        //CRIANDO OBJETO
        Cone cone = new Cone();

        //ENTRADA DE DADOS
        String input = "";
        input = JOptionPane.showInputDialog("Raio do CONE:");
        cone.setRaio(Float.parseFloat(input));
        input = JOptionPane.showInputDialog("Altura do CONE:");
        cone.setAltura(Float.parseFloat(input));

        //SAIDA DE DADOS
        String output = "DADOS DO CONE"
                + "GIRETRIZ: " + cone.calcularGiretriz() + "\n"
                + "ÁREA LATERAL: " + cone.calcularAreaLateral() + "\n"
                + "ÁREA TOTAL: " + cone.calcularAreaTotal() + "\n"
                + "VOLUME: " + cone.calcularVolume() + "\n";

        //Imprime o output na tela
        JOptionPane.showMessageDialog(null, output);
    }
}
