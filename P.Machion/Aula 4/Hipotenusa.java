import java.util.Scanner;

public class Hipotenusa{
    
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        double hipotenusa;
        double catetoAdjacente;
        double catetoOposto;

        System.out.println("Digite o valor do cateto adjacente: ");
        catetoAdjacente = scanner.nextDouble();

        System.out.println("Digite o valor do cateto oposto: ");
        catetoOposto = scanner.nextDouble();

        hipotenusa = Math.sqrt(
            Math.pow(catetoAdjacente, 2) + Math.pow(catetoOposto, 2)
        );

        System.out.printf("hipotenusa = %.2f\n", hipotenusa);

        scanner.close();
    }
}