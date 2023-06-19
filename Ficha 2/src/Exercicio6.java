import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio6 ***");

        // Definir variaveis
        double valor1, valor2;

        // Ler valor1
        System.out.print("Introduza o valor1: ");
        valor1 = input.nextDouble();

        // Ler valor2
        System.out.print("Introduza o valor2: ");
        valor2 = input.nextDouble();

        if (valor2 >= valor1)
            System.out.println(valor2 + " " + valor1);
        else
            System.out.println(valor1 + " " + valor2);
}
}

