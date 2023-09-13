import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2;

        // Ler do utilizador o num1 e num2
        System.out.print("Defina um primeiro numero:");
        num1= input.nextInt();

        System.out.print("Defina um segundo numero:");
        num2= input.nextInt();

        // Definir o maior através da Condição

        if (num1 > num2){
            System.out.println("O maior numero é:" +num1);
        } else {
            System.out.println("O maior numero é:" +num2);
        }
    }
}