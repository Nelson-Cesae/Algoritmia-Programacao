import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio12 ***");

        // Ler variaveis
        int numeroanterior, numeroatual;
        boolean ordemcrescente=true;

        // Pedir ao utilizador numeros inteiros
        System.out.println("Digite uma sequência de números inteiros (-1 para parar):");

        numeroanterior=Integer.MIN_VALUE;
        numeroatual= input.nextInt();

        while (numeroatual != -1) {
            if (numeroatual < numeroanterior) {
                ordemcrescente = false;
                break;
            }

            numeroanterior = numeroatual;
            numeroatual = input.nextInt();
        }


        if (ordemcrescente) {
            System.out.println("A sequência está em ordem crescente.");
        } else {
            System.out.println("A sequência não está em ordem crescente.");
        }

}
}
