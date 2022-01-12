package one.digitalinnovation.retorno;

    /*
     * Classe de Exemplo para o Exercicio da aula 3 de Métodos
     */

import one.digitalinnovation.sobrecarga.Quadrilatero;

public class Main {

    public static void main(String[] args) {

        // Quadrilátero com Retorno
        System.out.println("-----------------------------------");
        System.out.println("Exercício Quadrilátero com Retornos");
        double areaQuadrado = one.digitalinnovation.retorno.Quadrilatero.area(3);
        System.out.println("Área do Quadrado: " + areaQuadrado);

        double areaRetangulo = one.digitalinnovation.retorno.Quadrilatero.area(5,5);
        System.out.println("Área do Retângulo: " + areaRetangulo);

        double areaTrapezio = one.digitalinnovation.retorno.Quadrilatero.area(7,8,9);
        System.out.println("Área do Trapézio: " + areaTrapezio);

        System.out.println("-----------------------------------");

    }

}
