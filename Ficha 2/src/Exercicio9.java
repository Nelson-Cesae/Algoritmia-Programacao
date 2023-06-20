import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio9 ***");

        // Definir variaveis
        int num1, num2, num3;

        // Ler num1
        System.out.print("Introduza o num1: ");
        num1 = input.nextInt();

        // Ler num2
        System.out.print("Introduza o num2: ");
        num2 = input.nextInt();

        // Ler num3
        System.out.print("Introduza o num3: ");
        num3 = input.nextInt();

        if (num1 <= num2 && num1 <=num3) {
            if(num2<=num3)
                System.out.println(num1 + num2 + num3);
                else if (num2 <= num1 && num2<= num3)
                    if (num1<=num3)
                System.out.println(num2 + num1 + num3);
                else if (num3 <= num2 && num3 <= num1)
                    if (num3<=num2)
                System.out.println(num3 + num2 + num1);
            }
        }

}

