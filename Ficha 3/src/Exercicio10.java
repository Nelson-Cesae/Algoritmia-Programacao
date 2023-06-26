import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio10 ***");

        // Ler variaveis
        int num, intervalo1=0, intervalo2=0, intervalo3=0, intervalo4=0;

        // intervalo 1 [0, 25]
        // intervalo 2 [26, 50]
        // intervalo 3 [51, 75]
        // intervalo 4 [76, 100]

        System.out.println("Digite os números inteiros positivos (Digite um número negativo para encerrar):");

        while (true) {
            num = input.nextInt();

            if (num < 0) {
                break; // Sai do loop se o número for negativo
            } else if (num >= 0 && num <= 25) {
                intervalo1++;
            } else if (num >= 26 && num <= 50) {
                intervalo2++;
            } else if (num >= 51 && num <= 75) {
                intervalo3++;
            } else if (num >= 76 && num <= 100) {
                intervalo4++;
            }
        }

        System.out.println("Quantidade de números nos intervalos:");
        System.out.println("[0, 25]: " + intervalo1);
        System.out.println("[26, 50]: " + intervalo2);
        System.out.println("[51, 75]: " + intervalo3);
        System.out.println("[76, 100]: " + intervalo4);


            }
        }

