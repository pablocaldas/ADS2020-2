/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retangulo;

import javax.swing.JOptionPane;

/**
 *
 * @author PabloHenrique
 */
public class projetoRetangulo {

    public static void main(String[] args) {
        //Criando objeto Retangulo
        Retangulo ret = new Retangulo();

        //Dados da entrada
        String input = "";
        input = JOptionPane.showInputDialog("COMPRIMENTO DO RETANGULO:");
        ret.setComprimento(Float.parseFloat(input));
        input = JOptionPane.showInputDialog("LARGURA DO RETANGULO:");
        ret.setLargura(Float.parseFloat(input));

        //Dados da saida
        String output = "";
        output = "DADOS DO RETANGULO\n"
                + "Perimetro: " + ret.calcularPerimetro() + "\n"
                + "Area: " + ret.calcularArea() + "\n";
        
                //Imprime o output na tela
                JOptionPane.showMessageDialog(null, output);
    }
}
