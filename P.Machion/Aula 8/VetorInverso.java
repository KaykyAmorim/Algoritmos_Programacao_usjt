import java.util.Scanner;

public class VetorInverso{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print ("digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] v = new int[tamanho];
        for(int i=0; i<tamanho; i++){
            System.out.print("Digite o " + (i+1) + "\u0000 valor: ");
            v[i] = scanner.nextInt();
        }
        System.out.println("\nVetor invertido: ");
        for (int i = v.length-1; i >=0; i--){
            System.out.print(v[i] + " ");

        }

        scanner.close();
    }


}