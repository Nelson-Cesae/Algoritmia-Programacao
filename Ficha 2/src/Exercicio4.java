import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio4 ***");

        // Definir variaveis
        int posicao;

        // Ler posicao
        System.out.print("Introduza a posicao: ");
        posicao = input.nextInt();

        // Definir a posição
            switch (posicao){ // O numero de pontos é 10

                case 1: System.out.println("Pontos: " + 10);
                break;

                case 2: System.out.println("Pontos: " + 8);
                break;

                case 3: System.out.println("Pontos: " + 6);
                break;

                case 4: System.out.println("Pontos: " + 5);
                break;

                case 5: System.out.println("Pontos: " + 4);
                break;

                case 6: System.out.println("Pontos: " + 3);
                break;

                case 7: System.out.println("Pontos: " + 2);
                break;

                case 8: System.out.println("Pontos: " + 1);

                default: System.out.println("Definir como erro");
        }
    }
}