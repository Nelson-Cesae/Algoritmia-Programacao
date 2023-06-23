import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio3 ***");

        // Ler variaveis
        int numero;

        // Ler numero
        System.out.print("Defina um valor até 50: ");
        numero= input.nextInt();

        // Programa
        while (numero <= 50) {
            System.out.println(+numero);
            numero = numero + 1;
        }

}
}
