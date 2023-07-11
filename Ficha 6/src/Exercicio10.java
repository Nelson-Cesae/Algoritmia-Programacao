import java.util.Scanner;

// no uses new
public class Exercicio10 {

    /**
     * A função diz-nos se o vetor está em ordem crescente
     * @param vetor que se vai avaliar
     * @return true caso esteja ordem crescente e false caso não esteja
     */

    static boolean crescente(int[] vetor) {

        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                return false;
            }
        }

        return true;
    }

        public static void main(String[] args) {

            int[] vetor = new int[10];
            boolean c=true;

            // Instancia obrigatória do Scanner
            Scanner input = new Scanner(System.in);

            // Leitura do Array
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o elemento no array [" + i + "]: ");
                vetor[i] = input.nextInt();
            }

                c = crescente(vetor);

                if (c){
                    System.out.println("Os elementos estao em ordem crescente");

                } else {
                    System.out.println("Os elementos não estao em ordem crescente");
                }
            }
        }
