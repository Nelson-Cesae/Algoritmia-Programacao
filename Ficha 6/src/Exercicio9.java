import java.util.Scanner;

// no uses new
public class Exercicio9 {

    /**
     * A função diz-nos qual o menor elemento do vetor
     * @param vetor que se vai avaliar
     * @return o menor elemento do vetor (definido pelo utilizador)
     */

    static int menor(int[] vetor){
        int menorElemento=0;

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        for(int i=0; i<10; i++){
            System.out.print("Introduza o número "+i+" do vetor: ");
            vetor[i]= input.nextInt();
            menorElemento=vetor[0];

            if (vetor[i] < menorElemento) {
                menorElemento=vetor[i];
            }
        }

        return menorElemento;
    }

    public static void main(String[] args) {

        int[] vetor = new int[10];
        int menorElemento;

        // Ler números do utilizador
        menorElemento = menor(vetor);

        System.out.println("O menor valor do vetor e:" +menorElemento);
    }
}