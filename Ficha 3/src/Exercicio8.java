import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio8 ***");

        // Ler variaveis
        int num, par=2; // o par é um iterador

        // Ler numero
        System.out.println("Defina um numero: ");
        num = input.nextInt();

        // Programa

        while (par<=num) {
        if (par%2==0)
            System.out.println("Numero par"+par);
            par++;
        }


}
}