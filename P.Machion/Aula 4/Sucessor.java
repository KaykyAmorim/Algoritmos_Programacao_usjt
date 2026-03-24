import java.util.Scanner;

public class Sucessor{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double soma;
        double sucessorTriplo;
        double antecessorDobro;

        System.out.println("Digite um numero inteiro:");
        int inteiro = scanner.nextInt();

        sucessorTriplo = (inteiro * 3) + 1;
        antecessorDobro = (inteiro * 2 ) - 1;
        soma = sucessorTriplo +  antecessorDobro;

        System.out.println("Sucessor do triplo: " + sucessorTriplo);
        System.out.println("Antecessor do dobro: " + antecessorDobro);
        System.out.println("Soma: " + soma);

        scanner.close();
    }

}