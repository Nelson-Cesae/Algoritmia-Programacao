import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio1 ***");

        // Definir variaveis
        int num1, num2;

        // Ler num1
        System.out.print("Introduza um numero: ");
        num1=input.nextInt();

        // Ler num2
        System.out.print("Introduza um numero: ");
        num2=input.nextInt();

        // Condição

        if(num1==num2) { // num1 e num 2 sao iguais
            System.out.println("sao iguais!");
        }else {// num1 e num2 sao diferentes

            if (num1 > num2) {
                System.out.println("maior: " + num1);
            } else {
                System.out.println("maior: " + num2);
            }
        }
    }
}