/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paralelepipedo;

import javax.swing.JOptionPane;

/**
 *
 * @author PabloHenrique
 */
public class ProjetoParalelepipedo {

    public static void main(String[] args) {
        //Criando objeto
        Paralelepipedo para = new Paralelepipedo();

        //Entrada de dados
        String input = "";
        input = JOptionPane.showInputDialog("Altura do paralelepípedo:");
        para.setAltura(Float.parseFloat(input));
        input = JOptionPane.showInputDialog("Largura:");
        para.setLargura(Float.parseFloat(input));
        input = JOptionPane.showInputDialog("Comprimento:");
        para.setComprimento(Float.parseFloat(input));

        //saida de dados
        String output = "";
        output = "DADOS DO PARALELEPÍPEDO:\n"
                + "Volume: " + para.calcularVolume() + "\n"
                + "Ára: " + para.calcularArea() + "\n";

        //Imprime o output na tela
        JOptionPane.showMessageDialog(null, output);
    }
}
