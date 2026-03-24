import java.util.Scanner;

public class ConversorMoedas{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Double reais;
        final int cotacaoDollar =5;
        Double dollar;


        System.out.println("Digite a quantia em reais que vc tem:");
        reais = scanner.nextDouble();

        dollar = reais * cotacaoDollar;

        System.out.println("Quatidade em dollar que você terá:$ " + dollar );

        scanner.close();
    }
}