import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        //instanciar scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio7 ***");

        // Definir variaveis
        int valor1, valor2,valor3;

        //ler valor1
        System.out.print("Introduza um numero inteiro: ");
        valor1=input.nextInt();

        //ler valor2
        System.out.print("Introduza um numero inteiro: ");
        valor2=input.nextInt();

        // Apresentar Valor1
        System.out.println("Bom dia! O valor1: " +valor1);

        // Apresentar Valor1
        System.out.println("Bom dia! O valor2: " +valor2);


        System.out.println("\nTroca a acontecer...\n");

        // Logica troca
        valor1=valor1+valor2;
        valor2=valor1-valor2;
        valor1=valor1-valor2;

        // Troca Valor1 por Valor2

        System.out.println("Bom dia! O valor1 passa a: " +valor1);

        // Apresentar Valor1
        System.out.println("Bom dia! O valor2 passa a: " +valor2);



    }
}