import java.util.Scanner;

public class Radianos{

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        double angulo;
        double radianos;
        final double PI = Math.PI;

        System.out.println("Digite o ângulo(em graus): ");
        angulo = scanner.nextDouble();

        radianos = angulo * PI / 180;

        System.out.printf("Graus: %.2f = Radianos: %.2f\n", angulo , radianos );

        scanner.close();
    }
}