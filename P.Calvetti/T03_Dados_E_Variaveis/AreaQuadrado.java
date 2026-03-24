import java.util.Scanner;

public class AreaQuadrado{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        Double area = lado * lado;

        System.out.println("A área do quadrado será: " + area);

        scanner.close();
    }
}