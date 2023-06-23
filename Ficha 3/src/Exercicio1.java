import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio1 ***");

        // Ler variaveis
        int numeropar;

        numeropar=2;

        // Programa
        while (numeropar <= 300) {
            System.out.println(numeropar);
            numeropar = numeropar + 2;
        }
}
}


