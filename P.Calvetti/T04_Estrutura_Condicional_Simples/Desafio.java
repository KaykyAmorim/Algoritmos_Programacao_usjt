import java.util.Scanner;

public class Desafio{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        final int anoAtual = 2026;
        int idade;

        System.out.println("Digite seu ano de nascimento: ");
        int ano = scanner.nextInt();

        idade = anoAtual - ano;

        if( idade >=18) {
            System.out.println("Você ja tem idade suficiente para votar e dirigir.");
        }
        if(idade >=16 && idade < 18){
            System.out.println("Você tem idade para votar mas não para dirigi.");
        }
        if(idade < 16){
            System.out.println("Você não tem idade para votar e dirigir!!! ");
        }
    

        scanner.close();
    

    }
}