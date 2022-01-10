public class SegundoExercicio {

    /*
     * Classe de exemplo para exercícios da aula 2 de variáveis, Tipos de dados e operadores aritiméticos
     */


    public static void main(String[] args) {

        /*
         * Valores Inteiros
         */
        byte b1 = 10;
        byte b2 = 20;

        // Short tem a capacidade de armazenamento maior que byte
        short s1 = 20000;
    //  short s2 = 40000; // -> Está errado, o número esta ultrapassando muito o que o short pode suportar

        // Int tem a capacidade de armazenamento maior que short
    //  int i1 = -10000000000; // -> Está errado, o número esta muito abaixo do valor negativo que o inteiro pode suportar
        int i2 = 28500;

        // E Long Armazena bem mais que int
        long l1 = 1000000000000L; // -> Para se separar quem é inteiro de quem é long deve ser usado a letra "L"
        long l2 = 2004005000500055000L;  // -> Para se separar quem é inteiro de quem é long deve ser usado a letra "L"

        /*
         * Valores Reais com números fracionados
         */

        // Float tem a capacidade de armazenamento menor do que o double
    //  float f1 = 4.5; // -> Está errado, quando se coloca o número assim a linguagem Java interpreta como double
        float f2 = 10.68f; // -> Para o Java entender como float tem que colocar o "f" no fim da variável

        double d1 = 85.69;
        double d2 = 99.84d; // -> Se quiser dizer explicitamente que é double coloca "d" minusculo ou "D" maiusculo

        /*
         * Tipos de dados textuais
         */

        // Char aceita menos caractere do que uma String (apenas um) e se usa aspas simples
        char c1 = 'W';  // -> Somente aspas simples e um caracterere para o char
    //  char c2 = 'Tw';  // -> Tá errado, está tentando colocar dois caracteres no char, e ele não aceita
        char c3 = '\u0057';  // -> Aqui é um código unicode que representa o "W" mas de forma implicita

        // String sempre com aspas duplas,
        // e comumente usado para além de textos números o que acaba em alguns casos não sendo uma boa prática de programação
        String st1 = "fulano";
        String st2 = "cicrano";
        String st3 = "ag dgb se  se et t KNBJBJBB &* '' &%& 75894389";

        String dt1 = "09/02/1981";  // -> Ao colocar data em String, pode ocasionar um problema pois
        // podemos querer saber depois a mudança da data e para isso é preciso usar conversão
        // o que torna a programação bem mais longa e complexa. Portanto, não é uma boa prática.

        /*
         * Tipos Lógicos (Verdadeiro ou Falso)
         */

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);

    }

}
