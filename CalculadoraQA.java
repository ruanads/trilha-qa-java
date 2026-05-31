public class CalculadoraQA {

    // 1. Aqui dentro vão as nossas ferramentas (Somar, Subtrair, Validar)
    // Elas ficam soltas dentro da classe, prontas para serem usadas.
    public static int somar(int a, int b) {
        return a + b;
        }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static boolean positivo(int numero) {
        return numero > 0;
    }

    // 2. Aqui embaixo fica o botão de ligar o programa (o main)
    public static void main(String[] args) {
        // É aqui que vamos criar a calculadora e testar tudo.
        // 1. Testando a Soma
    int resultadoSoma = somar(5, 10);
    System.out.println("Teste Soma (5+10): " + resultadoSoma);

    // 2. Testando a Subtração
    int resultadoSubtracao = subtrair(10, 5);
    System.out.println("Teste Subtração (10-5): " + resultadoSubtracao);

    // 3. Testando a Validação (aqui é legal testar um positivo e um negativo!)
    boolean isPositivo = positivo(5);
    System.out.println("Teste Validação (5 é positivo?): " + isPositivo);

    boolean isNegativo = positivo(-5);
    System.out.println("Teste Validação (-5 é positivo?): " + isNegativo);


    int[] numeros = {1, 2, -3, 4, 5};
        for (int numero : numeros) {
            boolean ePositivo = positivo(numero);
            System.out.println("Número: " + numero + " é positivo? " + ePositivo);
        }
    }
}
