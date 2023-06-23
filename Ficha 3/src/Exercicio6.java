import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio6 ***");

        // Ler variaveis
        int numero, anterior, seguinte, conta;

        // ler numero
        System.out.print("Digite um numero inteiro: ");
        numero = input.nextInt();

        // Programa

        conta = 1;
        anterior = numero - 1;

        System.out.println("Os 5 numeros anteriores:");

        while (conta <= 5) {
            System.out.println(anterior);
            anterior--;
            conta++;
        }

        conta = 1;
        seguinte = numero + 1;

        System.out.println("Os 5 numeros seguintes:");

        while (conta <= 5) {
            System.out.println(seguinte);
            seguinte++;
            conta++;
        }

}
}
