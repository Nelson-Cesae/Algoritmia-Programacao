import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio1 ***");

        // Ler variaveis
        double valor1, valor2;
        String caracter, resposta;


        // Operação, valor 1, valor 2, String e Condição
        do {
            System.out.println("Apresente o valor numero 1:");
            valor1 = input.nextDouble();

            System.out.println("Apresente o valor numero 2:");
            valor2 = input.nextDouble();

            System.out.println("Escolha a operação a realizar (+, -, *,/:");
            caracter = input.next();

            // Condições
            if (caracter.equals("-")) {
                System.out.println(valor1 -= valor2);
            }
            if (caracter.equals("+")) {
                System.out.println(valor1 += valor2);
            }
            if (caracter.equals("*")) {
                System.out.println(valor1 *= valor2);
            }
            if (caracter.equals("/")) {
                System.out.println(valor1 /= valor2);
            }

                System.out.println("Deseja continuar? Se sim, digite s:");
            resposta = input.next();
            } while (resposta.equals("s"));



    }
}
