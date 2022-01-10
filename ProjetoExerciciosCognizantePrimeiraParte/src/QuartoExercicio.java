public class QuartoExercicio {

    /*
     * Classe de exemplo para exercícios da aula 4 de variáveis, Tipos de dados e operadores aritiméticos
     */

    public static void main(String[] args) {

        /*
         * Conversões (Casting)
         * DOWNCAST -> (perda de informação ao fazer o casting), é necessario explicitar o downcast pois vai ter perda de espaço
         * UPCAST -> (sobra de informaçõa ao fazer o casting) é feito de forma implicita pois sempre sobra espaço
         * TRUNCAR -> (Ignorar a parte fracionada, e mostra o valor inteiro)
         */

        // Aqui é um DOWNCAST pois o short tem a capacidade de armazenamento maior do que o byte,
        // com isso ocasionarará perda de informação
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; // -> Haverá perda de informação com o downcast

        // Nessa situação é ao contrário aqui é um UPCAST, não houve perda de informação, ou seja, esta sobrando espaço
        long l1;
        int i1 = 10;
        l1 = i1;

        // Aqui também é um DOWNCAST, mais uma vez haverá perda de informação
        int i2;
        long l2 = 10000000000L;
        i2 = (int) l2;

        // Nem sempre o DOWNCAST haverá perda de informação.
        // Nesse caso não ocasionará perda, pois o valor declarado em long cabe dentro de int por não ser muito grande.
        int i3;
        long l3 = 100000L;
        i3 = (int) l3;

        // Aqui é um UPCAST, o valor float foi promovido para o valor double
        double d1;
        float f1 = 10.5f;
        d1 = f1;

        // DOWNCAST mais uma vez terá perda de informação e não haverá, porque o valor double cabe dentro do float,
        // as casas decimais são poucas. Mas no outro exemplo existe muitas casas decimais e o float não surporta tudo
        float f2;
        float f3;
        double d2 = 10000.58d; // -> poucas casas decimais terá upcast
        f2 = (float) d2;
        double d3 = 10000.588888888888888888888888888888888888888888888888888888888888d; // -> muitas casas decimais terá downcast
        f3 = (float) d3;

        // Nesse caso o que acontece é que tem um valor fracionado sendo convertido para um inteiro,
        // então acorrerá TRUNCAMENTO do valor só irá mostrar a parte inteira do valor
        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4;

        System.out.println("b1 = " + b1);
        System.out.println("l1 = " + l1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("d1 = " + d1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("i4 = " + i4);

        // Nesse exemplo mostra que a conversão pode ser feita por qualquer tipo de dado
        b1 = (byte) d3;

        System.out.println("b1 = " + b1);

    }

}
