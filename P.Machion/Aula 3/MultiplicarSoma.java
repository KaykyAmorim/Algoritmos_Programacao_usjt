import java.util.Scanner;

public class MultiplicarSoma{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double primeiroNumero;
        double segundoNumero;
        double terceiroNumero;
        double soma;
        double resultado;
        
        System.out.println("digite o primeiro numero: ");
        primeiroNumero = scanner.nextDouble();

        System.out.println("digite o segundo numero: ");    
        segundoNumero = scanner.nextDouble();

        System.out.println("digite o terceiro numero: ");
        terceiroNumero = scanner.nextDouble();

        soma = primeiroNumero + segundoNumero;
        resultado = soma * terceiroNumero;

        System.out.println("resultado: " + resultado );
    }
}