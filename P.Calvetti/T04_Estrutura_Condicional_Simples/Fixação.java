import java.util.Scanner;

public class Fixação{

    public static void main(String[] args){
        
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int numero = scanner.nextInt();

    if(numero>=0)
    {System.out.println("Seu número é posititivo.");
    }
    else
    {System.out.println("Seu número é negativo.");
    }
     
    scanner.close();

    }
}