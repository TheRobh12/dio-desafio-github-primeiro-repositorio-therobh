public class TerceiroExercicio {

    /*
     * Classe de exemplo para exercícios da aula 3 de variáveis, Tipos de dados e operadores aritiméticos
     */

    public static void main(String[] args) {

        System.out.println("==================");
        System.out.println("PrePos");
        prePos();
        System.out.println("==================");
        System.out.println("Aritimético");
        aritimetico();
        System.out.println("==================");
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("==================");
        System.out.println("Precedência");
        precedencia();
        System.out.println("==================");
    }

    private static void prePos() {

        /*
         * PreFixado e PosFixado
         */

        int k = 10;

        int i = ++k; // -> PreFixado: primeiro soma uma unidade ao "K" depois atribui ao "I", ou seja, o i recebe 11
        int j = k--; // -> PosFixado: nesse caso primeiro atribui o "K" ao "J" para depois subtrair, ou seja, o "J" receberá 11 mas o "K" se transformará em 10 após isso
        int x = k;

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("x: " + x);
    }

    private static void aritimetico() {

        /*
         * Operações Aritiméticas Básicas
         */

        int a  = 10;
        int b  = 20;
        int c  = 30;
        int d  = 40;
        int e  = 50;

        int r1  = a+b;
        int r2  = c-a;
        int r3  = d*b;
        int r4  = e/a;
        int r5  = c%b;

        System.out.println("a+b: " + r1);
        System.out.println("c-a: " + r2);
        System.out.println("d*b: " + r3);
        System.out.println("e/a: " + r4);
        System.out.println("c%b: " + r5);

    }

    private static void atribuicao() {

        /*
         * Atribuições Simples e Atribuições Composta
         */

        int i  = 1500;
        short j  = 15;
        long l  = 500L;
        int k = 35;
        float f  = 3.5f;
        double d = f;

        System.out.println("d: " + d);

        i += 5; // i = i + 5
        j -= 3; // j = j - 3
        d /= 2.7d; // d = d / 2.7d
        l *= 3; // l = l * 3
        k %= 2; // k = k % 2

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("k: " + k);

        i = k = j;

        System.out.println("k: " + k);
        System.out.println("i: " + i);
    }

    private static void precedencia() {

        /*
         * Precedencia (mesclar aritiméticos, pre e posfixados)
         */

        int i = 10;
        int j = 20;
        int k = 30;

        // Existe uma ordem de execução primeiro sera executado os PosFixado
        int a = i++ + --j * k; // 10 + 19 * 30 -> 10 * 570 -> 580

        System.out.println("i++ + --j * k: " + a);

        System.out.println("i: " + i); // 11

        int b = k / --i % 3 + 1; // 30 / 10 % 3 + 1 -> 1

        System.out.println("k / --i % 3 + 1: " + b);

        System.out.println("i: " + i); // 10

        int c = 2;

        // Atribuição composta por outras atribuições (A atribuição com soma prevalece a atribuiçao com multiplicação)
        c *= i += 5; // c = 2 * 1; i = i + 5 -> c = 2 * i; i = 10 + 5; -> c = 2 * 15; -> c = 2 * 15; c = 30

        System.out.println("c *= i += 5: " + c);
    }
}
