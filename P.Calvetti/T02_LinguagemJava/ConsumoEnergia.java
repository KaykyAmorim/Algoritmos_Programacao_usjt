import java.util.Scanner;


public class ConsumoEnergia{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); 

        double potencia;
        double tempo;
        double preco;
        double ConsumoMensal;
        double ConsumoDiario;
        double CustoMensal;
        
        System.out.println ("Digite a potencia do aparelho (em Watts): ");
        potencia = scanner.nextDouble();

        System.out.println ("Digite quanto tempo voce usa por dia esse aparelho (em hrs): ");
        tempo = scanner.nextDouble();

        System.out.println("digite o preço do Kwh cobrado pela concenssionaria: ");
        preco = scanner.nextDouble();

        ConsumoDiario = potencia * tempo / 1000;
        ConsumoMensal = ConsumoDiario * 30;
        CustoMensal = ConsumoMensal * preco;

        System.out.printf ("Custo Mensal: %.2f ", CustoMensal);

        scanner.close();
        
        }
    }