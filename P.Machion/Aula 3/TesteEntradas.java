import java.util.Scanner;

public class TesteEntradas{

    public static void main (String[] args){
 
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Digite um inteiros:");
        int valorInteiro = scanner.nextInt();

        System.out.print("digite um valor com casas decimais: ");
        double valorDecimal = scanner.nextDouble();

        System.out.print ("digite verdadeiro (true) ou falso (false): ");
        boolean eVerdade = scanner.nextBoolean();
        
        System.out.println("veja os valores digitado");
        System.out.println("o inteiro " + valorInteiro);
        System.out.println ("o decimal: " + valorDecimal);
        System.out.println("o valor verdade " + eVerdade);
        scanner.close();
    }
}