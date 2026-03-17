import java.util.Scanner;



public class ConversorMoedas{

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        double reais;
        double cotacaoDollar;
        double quantidadeDollar;

        System.out.println("Digite a quantidade que você tem em reais: ");
        reais = scanner.nextDouble();

        System.out.println("Digite o valor do dollar atualmente: ");
        cotacaoDollar = scanner.nextDouble();

        quantidadeDollar = reais * cotacaoDollar;

        System.out.println("Quantidade Em dollar disponível: " + quantidadeDollar); 
    }
}