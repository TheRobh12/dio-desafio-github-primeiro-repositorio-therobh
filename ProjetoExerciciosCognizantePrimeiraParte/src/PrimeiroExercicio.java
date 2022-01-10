public class PrimeiroExercicio {



    /*
     * Classe de exemplo para exercícios da aula 1 de variáveis, Tipos de dados e operadores aritiméticos
     */

    public static void main(String[] args) {

        int i;
    //  int i; // -> Está errado não se pode declarar uma variável com o mesmo nome

        int I; // -> Com o I maiúsculo não deu erro porque o Java é case sensitive então o "I" se torna outra declaração de variável

    //  int 1a; // s-> Está errado variável em Java não pode começar com número

        int _1a; // -> Embora seja permitido não é uma boa prática de programação iniciar com Underline e Cifrão Variáveis
        int $aq; // -> Embora seja permitido não é uma boa prática de programação iniciar com Underline e Cifrão Variáveis

        /*
         * Variáveis sempre devem ser inicializadas
         */
        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10; // -> Final é uma constante significa que o "j" sempre terá esse valor, e não poderá ser alterado
    //  j = 15; // -> Está errado 15 está alterando o valor imultável da constante do j definido como final

        int asrn24678md;

    //  int asrn246 78md; // -> Está errado não pode haver espaços nas variáveis

        int asrn2$4678_md = 10; // -> Declaração da variável correta, porém não é uma boa prática usar cifrão e underline

    //  int asrn2$46%78_md = 10; // -> Está errado essa variável existe um caractere errado o porcento "%"
        // Parenteses, Arroba, Cerquilha, Porcento é proibido usar nas declarações de variável

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50; // -> Está correto e boa pratica de programação
        int QuantidadeProduto; // -> Está errado, não segue a boa pratica de primeira letra em minusculo

        final int NUMERO_TENTATIVAS = 5; // -> Aqui há uma regra de exeção em relação as constantes para uso de Underline,
        // e também o correto é ser declarado em letras maiúsculas as constantes

        final int numeroTentativas = 5; // -> Não esta declarado seguindo a boa prática do final, de letras maiusculas
        // portanto é uma má prática de programação

        int QUANTIDADE_OPCOES = 25; // -> É uma má prática de programação definir uma variável normal como se fosse final.

        int qtdProd; // -> Está errado essa variável, mesmo seguindo as boas práticas do camelCase,
        // ainda assim não explica claramente o que a variável se refere

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

    }

}
