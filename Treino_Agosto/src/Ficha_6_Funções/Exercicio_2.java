import java.util.Scanner;

public class Exercicio_2 {

    static boolean par(int num){

        if(num%2==0){
            System.out.println("Return true");
            return true;
        } else {
            System.out.println("Return false");
            return false;
        }

    }

    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero;

        // Ler valores do utilizador
        System.out.println("Introduza um numero:");
        numero = input.nextInt();

        if (par(numero)) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}

