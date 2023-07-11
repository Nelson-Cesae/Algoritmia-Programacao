import java.util.Scanner;

// no uses new
public class Exercicio7 {

    /**
     * A função preencherVetor define os numeros a preencher no vetor o e o imprimirVetor imprime o tamanho do mesmo
     * @param vetor a preencher
     * @param tamanho a imprimir
     * @return o vetor passado como argumento
     */

    static int[] preencherVetor(int[ ] vetor, int tamanho) {

        // Ciclo para preencher vetor com valores do utilizador.

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Ciclo para imprimir vetor.
        for(int i=0; i<tamanho; i++){
            System.out.print("Introduza número na posicao "+i+" do vetor: ");
            vetor[i]= input.nextInt();
        }

        return vetor;
    }

    static void imprimirVetor(int[ ] vetor, int tamanho){

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Ciclo para imprimir vetor.
        for(int i=0; i<tamanho; i++){
            System.out.println(vetor[i]);
        }

    }


    //no usages new
    public static void main(String[] args) {

        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);
        int tamanho;

        System.out.print("Tamanho do array: ");
        tamanho = input.nextInt();

        int [] vetor = new int[tamanho];

        vetor = preencherVetor(vetor, tamanho);
        imprimirVetor(vetor, tamanho);
    }
}



