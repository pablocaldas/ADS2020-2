/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocarrot;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class ProjetoCarroT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro cruzeDoAntonio = new Carro();
        Carro carroDoMarcus = new Carro();

        cruzeDoAntonio.placa = "ABC123";
        cruzeDoAntonio.marca = "GM";
        cruzeDoAntonio.modelo = "Cruze";
        cruzeDoAntonio.tipo_Do_Carro = "sedan";
        cruzeDoAntonio.tipo_Do_Combustivel = "Flex";
        cruzeDoAntonio.anoFabricacao = "2019";

        carroDoMarcus.placa = "XYZ890";
        carroDoMarcus.marca = "Toyota";
        carroDoMarcus.modelo = "Corola";
        carroDoMarcus.tipo_Do_Carro = "sedan";
        carroDoMarcus.tipo_Do_Combustivel = "Gasolina";
        carroDoMarcus.anoFabricacao = "2010";

        String saida = "Dados do Carro: \n";
        saida += "Placa: " + cruzeDoAntonio.placa + ".\n";
        saida += "Marca: " + cruzeDoAntonio.marca + ".\n";
        saida += "Modelo: " + cruzeDoAntonio.modelo + ".\n";
        saida += "Tipo do Carro: " + cruzeDoAntonio.tipo_Do_Carro + ".\n";
        saida += "Tipo do Combustivel: " + cruzeDoAntonio.tipo_Do_Combustivel + ".\n";

        JOptionPane.showMessageDialog(null, saida);
    }

}
