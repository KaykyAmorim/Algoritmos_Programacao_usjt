import java.util.Scanner;

public class ConversorDeQuilometros{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double quilometros;
        double milhas;

        System.out.println("Digite quantos quilômetros você percorreu: ");
        quilometros = scanner.nextDouble();

        milhas = quilometros / 1.61;

        System.out.printf("Você percorreu: %.2f Milhas\n", milhas );
        
        scanner.close();
    }
}