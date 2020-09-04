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
public class Triangulo {

    //ATRIBUTOS
    private int ladoA = 1;
    private int ladoB = 1;
    private int ladoC = 1;

    //METODOS
    /**
     * @return the ladoA
     */
    public int getLadoA() throws Exception {
        if (ladoA <= 1) {
            throw new Exception("NÃO EXISTE LADO DESSE TAMANHO");
        }
        return ladoA;
    }

    /**
     * @return the ladoB
     */
    public int getLadoB() {
        return ladoB;
    }

    /**
     * @return the ladoC
     */
    public int getLadoC() {
        return ladoC;
    }

    //METODO CONSTRUTOR
    public Triangulo(int la, int lb, int lc) throws Exception {
        if (validarTriangulo(la, lb, lc) == false) {
            throw new Exception("Valor dos lados não formam triangulo.");
        }
        ladoA = la;
        ladoB = lb;
        ladoC = lc;
    }

    //CALCULO DO TRIANGULO
    public void setMedidas(int la, int lb, int lc) throws Exception {
        if (validarTriangulo(la, lb, lc) == false) {
            throw new Exception("VALORES INVALIDOS. TENTE NOVAMENTE!");
        }
        ladoA = la;
        ladoB = lb;
        ladoC = lc;
    }

    //CALCULO DO TRIANGULO / VALIDA TRIANGULO
    public static boolean validarTriangulo(int la, int lb, int lc) {
        if (la >= lb + lc || lb >= la + lc || lc >= la + lb) {
            return false;
        }
        return true;
    }

    public String Lados() throws Exception {
        validarTriangulo(ladoA, ladoB, ladoC);
        if (ladoA == ladoB && ladoB == ladoC) {
            return "TRIANGULO EQUILATERO";
        } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
            return "TRIANGULO ESCALENO";
        } else {
            return "TRIANGULO ISOSCELES";
        }
    }

    public String Angulos() throws Exception {
        if ((ladoA * ladoA) < (ladoB * ladoB) + (ladoC * ladoC)) {
            return "TRIANGULO ACUTANGULO";
        } else if ((ladoA * ladoA) > (ladoB * ladoB) + (ladoC * ladoC)) {
            return "TRIANGULO OBTUSANGULO";
        } else {
            return "TRIANGULO RETANGULO";
        }
    }
}
