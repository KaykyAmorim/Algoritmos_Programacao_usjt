//ler inteiros até que a soma deles atinja 1000
//a) usando while
//b) usando do-while
import java.util.Scanner;

public class Soma1000{
    public static void main(String[]args){

        int numero, soma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Digite seus numeros até bater 1000: ");
        numero = scanner.nextInt();
        soma = numero;
        while (soma < 1000){
            System.out.print("Digite seus números até bater 1000: ");
            numero = scanner.nextInt();
            soma = soma + numero;

        }
        System.out.println("Voce atingiu: " + soma);

        scanner.close();
    }
}