import java.util.Scanner;

public class Pavimentacao{

    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        double raio;
        double custoPorMetroQuadrado;
        double areaPraca;
        double custoTotal;
        final double PI = Math.PI;

    

        System.out.println("Digite o raio da praça: ");
        raio = scanner.nextDouble();


        System.out.println("Digite o preço do m² do piso desejado: ");
        custoPorMetroQuadrado = scanner.nextDouble();

        areaPraca = PI * raio * raio ;
        custoTotal = areaPraca * custoPorMetroQuadrado;

        System.out.printf("Area da praça: %.2f m²\n", areaPraca );
        System.out.printf("Custo que será usado para pavimentar a praça: R$ %.2f\n", custoTotal );

        scanner.close();

    }
}