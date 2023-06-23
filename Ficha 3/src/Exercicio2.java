import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio2 ***");

        // Ler variaveis
        int numeroimpar;

        numeroimpar=531;

        // Programa
        while (numeroimpar <= 750) {
            System.out.println(numeroimpar);
            numeroimpar = numeroimpar + 2;
        }
}
}
