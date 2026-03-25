import java.util.Scanner;

public class IdadeNadador{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        if(idade >= 18)
        {System.out.println("Categoria Adulta!");
        }
        else
        {System.out.println("Não se aplica na categoria adulta.");
        }
        scanner.close();
    }
}