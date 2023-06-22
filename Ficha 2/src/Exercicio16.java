import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio16 ***");

        // Definir variaveis
        int  valor, nota200, nota100, nota50, nota20, nota10, nota5;

        // ler valor
        System.out.print("Valor em euros, multiplos de 5: ");
        valor= input.nextInt();


        // Condição: definir se o valor é multiplo de 5
        if (valor %5!=0); {
            System.out.println("O valor é um multiplo de 5");
        }

        // Programa Valor decomposto

        nota200 = valor / 200;
        valor %= 200;
        System.out.println("Notas de 200 euros: " + nota200);

        nota100 = valor / 100;
        valor %= 100;
        System.out.println("Notas de 100 euros: " + nota100);

        nota50 = valor / 50;
        valor %= 50;
        System.out.println("Notas de 50 euros: " + nota50);

        nota20 = valor / 20;
        valor %= 20;
        System.out.println("Notas de 20 euros: " + nota20);

        nota10 = valor / 10;
        valor %= 10;
        System.out.println("Notas de 10 euros: " + nota10);

        nota5 = valor / 5;
        valor %= 5;
        System.out.println("Notas de 5 euros: " + nota5);

        // Resultado

        System.out.println("Valor: " + valor);
        System.out.println("Notas:");

        }
}

