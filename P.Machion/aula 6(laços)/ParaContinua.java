//construir um laço SENTINELA que executa até que o usuário digite para
import java.util.Scanner;

public class ParaContinua{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String ordem;

        // do {
        //     System.out.print("digite PARE se quiser parar: ");
        //     ordem = scanner.nextLine();       
        //    } while(!(ordem.toUpperCase().equals("PARE")));
        System.out.print ("Digite PARE se quiser para: ");
        ordem = scanner.nextLine();
        while(!(ordem.toUpperCase().equals("PARE"))){
            System.out.print("Digite PARE se quiser parar: ");
            ordem = scanner.nextLine();
        }
    }
}
