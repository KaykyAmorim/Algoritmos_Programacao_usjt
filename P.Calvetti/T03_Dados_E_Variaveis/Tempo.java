import java.util.Scanner;

public class Tempo{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int segundosTotal;
        int horas, minutos, segundos;

        System.out.println("Digite o Tempo em segundos: ");
        segundosTotal = scanner.nextInt();

        horas = segundosTotal / 3600;
        // no fim opetei por não declarar o resto pois não precisava, ai ja usei % como resto direto.
        minutos = (segundosTotal % 3600) / 60; 
        segundos = segundosTotal % 60;

        System.out.println("Resultado");
        System.out.println(horas + "Horas, " + minutos + "Minutos, " + segundos  + "Segundos");


        scanner.close();
    }
}