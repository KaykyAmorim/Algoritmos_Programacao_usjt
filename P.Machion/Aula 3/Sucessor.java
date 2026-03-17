import java.util.Scanner;

public class Sucessor{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

    int sucessor;
    int antecessor;
    int numero;

    System.out.println("digite um numero:");
    numero = scanner.nextInt();

    sucessor = numero + 1;
    antecessor = numero - 1;

    System.out.println("sucessor =" + sucessor);
    System.out.println("antecessor =" + antecessor);    


    }
}