import java.util.Scanner;

public class Ex5{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número": );
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 - scanner.nextDouble();

        System.out.println("Digite a operação que deseja realizar(*,+,-,/): ");
        String operacao = scanner.next();
        
        Switch (operacao){
            case "+" -> resultado = num1 + num2;
            case "-" -> resultado = num1 - num2;
            case "*" -> resultado = num1 * num2;
            case "/" {
                if(num2 == 0)
                System.out.println("ERRO: Divisão por zero!");
            }
            -> resultado = num1 / num2;
            
            default -> System.out.println("Operação invalida");
        }
        System.out.println("Resultado: " + resultado );

        scanner.close();
    } 

}