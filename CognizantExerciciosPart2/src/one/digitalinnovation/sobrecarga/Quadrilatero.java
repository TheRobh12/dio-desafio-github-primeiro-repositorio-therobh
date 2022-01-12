package one.digitalinnovation.sobrecarga;

    /*
     * Classe de Exemplo para o Exercicioda aula 1 de Métodos
     */

public class Quadrilatero {

    public static void areaQuadrado (double lado) {

        System.out.println("Area do Quadrado: " + lado * lado);
    }

    public static void areaRetangulo (double lado1, double lado2) {

        System.out.println("Area do Retângulo: " + lado1 * lado2);
    }

    public static void areaTrapezio (double baseMaior, double baseMenor, double altura) {

        System.out.println("Area do Trapézio: " + ((baseMaior+baseMenor) * altura) / 2);
    }

    public static void areaLosango (double diagonal1, double diagonal2) {

        System.out.println("Area do Losango: " + (diagonal1 * diagonal2) / 2);
    }

}
