import java.util.Scanner;

    public class SomaDois{
        public static void main (String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("digite o primeiro numero: ");
            double primeiroNumero = scanner.nextDouble();

            System.out.print("digite o segundo numeoro: ");
            double segundoNumero = scanner.nextDouble();

            double soma = primeiroNumero + segundoNumero;
            System.out.println ("soma = " + soma);
    
            scanner.close();

    }


}