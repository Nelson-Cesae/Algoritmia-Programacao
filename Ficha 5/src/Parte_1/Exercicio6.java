package Parte_1;

import java.sql.SQLOutput;
import java.util.Scanner;

// no uses new
public class Exercicio6 {
    //no usages new
    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        // Ler variáveis
        int[] vetor = new int[10];
        int i=0;
        boolean crescente=true;

        // Leitura do Array
        for (i = 0; i < 10; i++) {
            System.out.print("Digite o elemento no array ["+i+"]: ");
            vetor[i] = input.nextInt();
        }

        // Verificação do boolean - array crescente ou não?
        for(i = 0; i<vetor.length-1 ; i++){
            if (vetor[i]> vetor[i+1]) {
                crescente= false;
            }
        }
        if (crescente){
            System.out.println("Os elementos estão em ordem crescente");

        } else {
            System.out.println("Os elementos não estão em ordem crescente");
        }
    }
}