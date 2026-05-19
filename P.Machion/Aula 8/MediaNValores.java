import java.util.Scanner;

    public class MediaNValores{
        public static void main(String[] args){

            Scanner scanner = new Scanner (System.in);

            System.out.print("Digite a quantidade de valores:  ");
            int n = scanner.nextInt();
            int soma = 0, cont = 1;

            for( ; cont <=n; cont ++) {
                    System.out.print("Digite o " + cont + "\000 valor: ");
                    int valor = scanner.nextInt();
                    soma = soma + valor;
            }

                double media = (double)soma / n;
                System.out.println("Media =  %.2f\n" , media);

                int[] v = new int[n];

                for(cont=0, soma=0; cont < n; cont++){
                    System.out.print("Digite o" + (cont+1) + "\u0000 valor: ");
                    v[cont] = scanner.nextInt();
                    soma +=v[cont];
                } 
                media = (double)soma/ n;
                System.out.println("\nsua lista:");
                for(int = 0; i<n; i++) {
                    System.out.printf(v[i] + " ");
                }
                System.out.printf("\nmedia = %.2f\n")
            
                
                scanner.close();
    }
}