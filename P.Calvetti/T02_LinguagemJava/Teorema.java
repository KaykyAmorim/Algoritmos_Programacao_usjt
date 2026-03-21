import java.util.Scanner;

public class Teorema{

    public static void main(String []args){
      
         Scanner scanner = new Scanner(System.in);

        double catetoOposto;
        double catetoAdjacente;
        double hipotenusa;

        System.out.println("Digite o valor do cateto oposto: ");
        catetoOposto = scanner.nextDouble();

        System.out.println("Digite o valor do cateto adjacente: ");
        catetoAdjacente = scanner.nextDouble();

        hipotenusa = Math.sqrt(
            Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2)
            );

        System.out.printf("Hipotenusa: %.2f\n ", hipotenusa);    

        scanner.close();
     }

}