import java.util.Scanner;

public class Lógica2{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double nota1;
        double nota2;
        double notaFinal;

        System.out.println("Digite a 1° nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a 2° nota: ");
        nota2 = scanner.nextDouble();

        notaFinal = (nota1 + nota2) / 2;

        System.out.println("Nota Final: " + notaFinal);

        if(notaFinal <6)
        {System.out.println("Exame!");
        }
        if(notaFinal >= 6)
        {System.out.println("Aprovado!");
        }


        scanner.close();
    }
}