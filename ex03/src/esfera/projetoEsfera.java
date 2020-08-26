/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esfera;

import javax.swing.JOptionPane;

/**
 *
 * @author PabloHenrique
 */
public class projetoEsfera {

    public static void main(String[] args) {
        //Criando objeto Esfera
        Esfera essaFera = new Esfera();

        //Entrada de dados da Esfera(essaFera)
        String input = "";
        input = JOptionPane.showInputDialog("RAIO DA ESFERA:");
        essaFera.setRaio(Float.parseFloat(input));

        //Saida de dados
        String output = "";
        output = "DADOS DA ESFERA:\n"
                + "Area da esfera: " + essaFera.calcularArea() + "\n"
                + "Volume da esfera: " + essaFera.calcularVolume() + "\n";

        JOptionPane.showMessageDialog(null, output);

    }
}
