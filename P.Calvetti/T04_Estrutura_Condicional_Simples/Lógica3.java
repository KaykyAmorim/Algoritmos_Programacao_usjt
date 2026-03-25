import java.util.Scanner;

public class Lógica3{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if(numero % 5 == 0 && numero % 3 == 0)
        {System.out.println(numero + " É multiplo de 5 e 3. ");
        }
        else{System.out.println(numero + " não é multiplo de 5 e 3.");
        }
        scanner.close();
    }
}