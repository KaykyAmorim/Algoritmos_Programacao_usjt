import java.util.Random;
import java.util.Scanner;

public class Aposta {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int premio = 100;
        int continua = 1;

        while(premio > 0 && continua==1) {
            boolean sorte = random.nextBoolean();
            if(sorte) {
                premio = premio + 100;
                System.out.println("premio atual = R$" + premio);
                System.out.println("digite 1 para continuar, ou 0 para parar: ");
                continua = scanner.nextInt();
            }
            else {
                System.out.println("Perdeeeu!!!");
                premio = 0;
            }
        }
    }
}
