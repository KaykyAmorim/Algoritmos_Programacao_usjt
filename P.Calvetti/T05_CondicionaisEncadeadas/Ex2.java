import java.util.Scanner;

public class Ex2{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double numero;

        System.out.println("digite um número: ");
        numero = scanner.nextDouble();

        if(numero == 0) {
            System.out.println("Seu número é o Zero");     
            } else if(numero < 0){
                System.out.println("Seu númeor é negativo");
            } else{
                System.out.println("Seu número é positivo");
                }

            scanner.close();

    }
}