import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio8 ***");

        // Definir variaveis
        double nota1, nota2, nota3, media;

        // Ler nota1
        System.out.print("Introduza o nota1: ");
        nota1 = input.nextDouble();

        // Ler nota1
        System.out.print("Introduza o nota2: ");
        nota2 = input.nextDouble();

        // Ler nota1
        System.out.print("Introduza o nota3: ");
        nota3 = input.nextDouble();

        // Calcular media ponderada
       media= (nota1 * 0.25)+(nota2 * 0.35)+(nota3 * 0.4);


        // Apresentar media ponderada
        System.out.println("A media : " +media);


        // Aprovação ou não
        if (media>= 9.5) {
                        System.out.println("O aluno está aprovado");
            } else {
                System.out.println ("O aluno está reprovado");
            }
        }
}


