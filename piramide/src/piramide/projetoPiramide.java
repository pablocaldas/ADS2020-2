/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramide;

import javax.swing.JOptionPane;

/**
 *
 * @author PabloHenrique
 */
public class projetoPiramide {

    public static void main(String[] args) {
        //Criando objeto piramide Kelps
        Piramide kelps = new Piramide();

        //Entrada de Dados
        String input = "";
        input = JOptionPane.showInputDialog("BASE:");
        kelps.setBase(Float.parseFloat(input));
        input = JOptionPane.showInputDialog("ALTURA:");
        kelps.setAltura(Float.parseFloat(input));

        //Saída de Dados
        String output = "";
        output = "DADOS DA PIRAMIDE KELPS\n"
                + "Base: " + kelps.getBase() + "\n"
                + "Altura: " + kelps.getAltura() + "\n"
                + "Volume: " + kelps.calcularVolume() + "\n";

        JOptionPane.showMessageDialog(null, output);
    }
}
