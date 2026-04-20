import java.util.Scanner;

    public class Tabuada{
        public static void main(String [] args){

            Scanner scanner = new Scanner(System.in);
            
            System.out.print ("digite o numero da tabuada: ");

            int n = scanner.nextInt();
            int cont = 0;

            while(cont <= 10) {
                //System.out.println(n+ " x " + cont + "=" + n * cont);
                System.out.printf("%2d x %2d = %3d\n", n, cont, n*cont);
                cont++;
            }
            System.out.println("\n ----- usando for ------");
            for(cont == 0; cont<= 10; cont ++);
                System.out.printf("%d2 x %d2 = %3d\n", n cont, n*cont);




            scanner.close();
        }

    }