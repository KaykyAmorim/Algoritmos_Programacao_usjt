import java.util.Scanner;

public class Media{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double media;

        System.out.println("Digite a 1° nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a 2° nota: ");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a 3° nota: ");
        nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A media será:%.2f\n", media);

        scanner.close();

    }
}