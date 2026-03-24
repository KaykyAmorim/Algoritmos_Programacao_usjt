import java.util.Scanner;

public class CalculoImc{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        double peso;
        double altura;
        double imc;

        System.out.println("Digite o peso: ");
        peso = scanner.nextDouble();

        System.out.println("Digite a altura: ");
        altura = scanner.nextDouble();

        imc = peso / Math.pow(altura, 2);

        System.out.println("O valor do imc será: " + imc );

        scanner.close();



        
    }
}