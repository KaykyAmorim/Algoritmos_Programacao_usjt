import java.util.Scanner;

public class Desafio2{
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1° valor ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite o 2° valor ");
        double n2 = scanner.nextDouble();

        System.out.println("Digite o 3° valor ");
        double n3 = scanner.nextDouble();

        if(n1 <= 0 || n2 <= 0 || n3 <= 0){
            System.out.println("Todos os lados devem ser maiores que 0 !!!");
        }
         else if(n1 + n2 > n3 && n1 + n3 > n2 && n2 + n3 > n1){
            System.out.println("Você pode formar um triângulo! ");
        } else {
            System.out.println("Você não pode formar um triângulo com esses valores !!!");

            scanner.close();
        }

    }

}