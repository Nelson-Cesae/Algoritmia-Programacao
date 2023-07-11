import java.util.Scanner;

// no uses new
public class Exercicio8 {

    /**
     * A função diz-nos qual o maior elemento do vetor
     * @param vetor que se vai avaliar
     * @return o maior elemento do utilizador (definido pelo utilizador)
     */

    static int maior(int[] vetor){
        int maiorElemento=0;

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        for(int i=0; i<10; i++){
            System.out.print("Introduza o número "+i+" do vetor: ");
            vetor[i]= input.nextInt();
            maiorElemento=vetor[0];

            if (vetor[i] > maiorElemento) {
                maiorElemento=vetor[i];
            }
        }

        return maiorElemento;
    }

    public static void main(String[] args) {

        int[] vetor = new int[10];
        int maiorElemento;

        // Ler números do utilizador
        maiorElemento = maior(vetor);

        System.out.println("O maior valor do vetor e:" +maiorElemento);
    }
}








