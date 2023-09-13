import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, soma;

        //Pedir números ao Utilizador

        System.out.print("Defina um primeiro número:");
        num1 = input.nextInt();

        System.out.print("Defina um segundo número:");
        num2 = input.nextInt();

        //Soma dos 2 números

        soma = num1 + num2;

        // Apresentar resultado

        System.out.print("A soma do num1 com o num2 é:" + soma);

    }
}