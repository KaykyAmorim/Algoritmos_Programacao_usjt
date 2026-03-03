public class Variaveis {
 public static void main (String[] args) {
    //declarando variaveis 
    int a =19, b = 4;
    //realizando operações com variaveis inteiras
    int soma = a + b;
    int subtracao = a - b;
    int multiplicacao = a * b;
    int divisao = a / b;
    int resto = a % b; //esta é a operação resto da divisão inteira
    //exibindo o resultado das operações
    System.out.println ("soma =" + soma);
    System.out.println ("subtracao =" + subtracao);
    System.out.println ("multiplicacao =" + multiplicacao);
    System.out.println ("divisao =" + divisao);
    System.out.println ("resto =" + resto);
    //trabalhando com variáveis double
    //declaração
    double x = 7.5, y = 0.25;
    //realiza as operações, declarando as variáveis de resultado    
    double somaDouble = x + y;
    double subtracaoDouble = x - y;
    double multiplicacaoDouble = x * y;
    double divisaoDouble = x / y;
    //não tem resto pois é uma divisão com números decimais

    //exibindo resultados
    System.out.println (x + "+" + y + "=" + somaDouble);
    System.out.println (x + "+" + y + "=" + multiplicacaoDouble);
    System.out.println (x + "-" + y + "=" + subtracaoDouble);
    System.out.println (x + "/" + y + "=" + divisaoDouble);
    //exemplo de int com double 
    double resultado = a * x + b * y;
    System.out.println("resultado =" + resultado);
    String nome = "Andreia", sobrenome = "Machion";
    System.out.println (nome + " " + sobrenome);
 }    
}
