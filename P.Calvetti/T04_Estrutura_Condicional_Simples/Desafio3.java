import java.util.Scanner;

public class Desafio3 {

    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite um segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.println("Digite um terceiro número: ");
        double n3 = scanner.nextDouble();

         if (n1 <= n2 && n2 <= n3) { //n1 menor número e n3 maior.
            System.out.println(n1 + "\n" + n2 + "\n" + n3);
        }

        if (n1 <= n3 && n3 <= n2) { //n1 menor n2 maior
            System.out.println(n1 + "\n" + n3 + "\n" + n2);
        }

        if (n2 <= n1 && n1 <= n3) { // n2 menor n3 maior
            System.out.println(n2 + "\n" + n1 + "\n" + n3);
        }

        if (n2 <= n3 && n3 <= n1) { // n2 menor n1 maior
            System.out.println(n2 + "\n" + n3 + "\n" + n1);
        }

        if (n3 <= n1 && n1 <= n2) { // n3 menor n2 maior 
            System.out.println(n3 + "\n" + n1 + "\n" + n2);
        }

        if (n3 <= n2 && n2 <= n1) { // n3 menor n1 maior
            System.out.println(n3 + "\n" + n2 + "\n" + n1);
        }

        
    scanner.close();

    }
}

   