import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int sorteado = random.nextInt(10) + 1;
        int chute;
        do{
            System.out.print("Adivinhe o número de 1 a 10: ");
            chute = scanner.nextInt();
            if (chute > sorteado) {
                System.out.println("É mais baixo ");
            }
            else if(chute < sorteado) {
                System.out.println("É mais alto");
            }
            contador ++;
        }while (chute != sorteado && contador < 3);

        if( chute == sorteado) {
            System.out.println("Parabens!!!");
        }
        else {
            System.out.println("Não foi desta vez, era" + sorteado);
        }
        scanner.close();
        
    }
}