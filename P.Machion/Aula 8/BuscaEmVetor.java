import java.util.Random;
import java.util.Scanner;


public class BuscaEmVetor{

    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in).
        Random random = new Random();
        int[] v = new int[10];
        for(int i=0; i<10; i++){
            v[i] = random.nextInt();
            System.out.print(v[i] + " ");

        }
        System.out.print("Digite o valor para busca: ");
        int  x = scanner.nextInt();
        boolean achei = false;
        int i=0;
        while(i < 10 && !achei){
                if(v[] == x){
                    achei = true;
                }
            i++;
        }
        if(achei){
            System.out.println("Valor encontrado no vetor");
        }
        else{
            System.out.println("valor não encontrado no vetor");  
        }
        int maiot = v[0];
        for(i=1; i<10; i++){
            if(v[i] > maior){
                maior = v[i];
            }
        }

        System.out.println("O naior valor e " + maior);

        scanner.close();

    }
}