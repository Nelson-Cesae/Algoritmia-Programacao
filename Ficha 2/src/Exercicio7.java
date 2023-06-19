import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio7 ***");

        // Definir variaveis
        double numero;

        // Ler numero
        System.out.print("Introduza o numero: ");
        numero = input.nextDouble();

        if (numero==2)
        System.out.println("O numero e par");
        else
        System.out.println ("O numero é impar");
}
}