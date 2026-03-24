import java.util.Scanner;


public class Imc{

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        Double peso;
        Double altura;
        Double imc;

        System.out.println("Digite o peso: ");
        peso = scanner.nextDouble();

        System.out.println("Digite a altura: ");
        altura = scanner.nextDouble();

        imc = peso / Math.pow(altura, 2);

        System.out.printf("O valor do Imc será: %.2f\n", imc);

        scanner.close();


    }
}