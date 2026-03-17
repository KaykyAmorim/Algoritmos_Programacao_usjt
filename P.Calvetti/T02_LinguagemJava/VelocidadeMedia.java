
import java.util.Scanner;


public class VelocidadeMedia{
     
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double tempo;
        double distancia;
        double VelocidadeMedia;

        System.out.println("digite a distância percorrida (em km):");
        distancia = scanner.nextDouble();

        System.out.println("digite o tempo gasto (em horas):");
        tempo = scanner.nextDouble();

        VelocidadeMedia = distancia / tempo;

        System.out.println("Velocidade Média:" + VelocidadeMedia + " km/h");
    }
}
