import java.util.Scanner;



public class ConversorMoedas{

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        double reais;
        double cotacaoDollar = 5.22;
        double quantidadeDollar;

        System.out.println("Digite a quantidade que você tem em reais: ");
        reais = scanner.nextDouble();

        quantidadeDollar = reais * cotacaoDollar;

        System.out.println("Quantidade Em dollar disponível: " + quantidadeDollar); 

        Scanner.close();
    }
    
}