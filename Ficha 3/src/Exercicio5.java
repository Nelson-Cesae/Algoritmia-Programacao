import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio5 ***");

        // Ler variaveis
        int numero, somatorio;

        // Ler numero
        numero = 1;

        // Ler somatorio
        somatorio = 0;

        //Programa

        while (numero <= 100) {
            System.out.println(numero);
            somatorio += numero;
            numero++;
        }

        System.out.println("Somatório: " + somatorio);
}
}
