import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int limite, iterador=0;

        // Ler valores do utilizador
        System.out.print("Defina um numero inteiro:");
        limite= input.nextInt();

        // Programa leitura

        while (iterador<=limite){
            System.out.println(iterador);
            iterador++;
        }
    }
}