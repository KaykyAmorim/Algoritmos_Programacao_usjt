import java.util.Scanner;

public class Ex3{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String letra;

        System.out.println("Digite uma letra: ");
        letra = scanner.nextLine().trim().toLowerCase();

        switch (letra){
            case "a", "e", "i","o", "u" -> System.out.println("Sua letra é uma vogal.");
            default -> System.out.println("Sua letra é uma consoante.");
        }
        scanner.close();
    }
}