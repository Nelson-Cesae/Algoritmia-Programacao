import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio13 ***");

        // Definir variaveis
        int n, iterador, fatorial;

        // Pedir ao utilizador numero inteiro não-negativo
        System.out.println("Defina um numero inteiro não-negativo:");
        n=input.nextInt();

        // Ler variaveis iterador e fatorial
        fatorial=1;
        iterador=1;

        // Programa
        while (iterador <= n){
            fatorial*=iterador;
            iterador++;
        }

        System.out.println("o fatorial de"+n+"é"+fatorial);
}
}
