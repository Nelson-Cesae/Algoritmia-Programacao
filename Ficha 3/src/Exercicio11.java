import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio11 ***");

        // Ler variaveis
        int inicio, fim, numero;

        // Ler num1 e num2
        System.out.print("Valor do Inicio do intervalo: ");
        inicio= input.nextInt();

        System.out.print("Valor do Fim do intervalo: ");
        fim= input.nextInt();

        // Definir Multiplos
        System.out.println("Múltiplos de 5 entre " + inicio + " e " + fim + ":");

        numero=inicio;
        while (numero <= fim) { //while para iterar (loop, contador) de inicio até fim.
            if (numero % 5 == 0) { //verificar se o número atual é um múltiplo de 5 usando o operador %.
                System.out.println(numero);
            }

            numero++;
        }


}
}
