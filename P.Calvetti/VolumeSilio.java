import java.util.Scanner;

public class VolumeSilio{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double raioBase;
        double altura;
        double volumeSilio;

        System.out.println("digite o raio da base (em M)");
        raioBase = scanner.nextDouble();

        System.out.println("digite a altura (em M)");
        altura = scanner.nextDouble();

        volumeSilio = raioBase * raioBase * Math.PI * altura;

        System.out.println("Volume do silio = " + volumeSilio + "m³");
    }
}