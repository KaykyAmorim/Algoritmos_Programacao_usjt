import java.util.Scanner;

public class Ex4{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double preco;

        System.out.println("Digite o preço do seu produto: ");
        preco = scanner.nextDouble();

        if(preco > 50 && preco < 100){
        System.out.println("o preço do seu produto é MÉDIO. ");
        } else if (preco >= 100){
            System.out.println("o preço do seu produto é CARO. ");
        } else if (preco <= 50){
            System.out.println("o preço do seu produto é BARATO. ");
        }

        scanner.close();
    }
}