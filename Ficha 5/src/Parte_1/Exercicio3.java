package Parte_1;

import java.util.Scanner;

// no uses new
public class Exercicio3 {
    //no usages new
    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        // Declarar as variáveis
        int[] vetor = new int[10];
        int maiorElemento=0;


        System.out.print("Introduza um numero no array[" + 0 + "]: ");
        vetor[0] = input.nextInt();
        maiorElemento=vetor[0];

        // Ciclo para introduzir numeros no array (ou vetor)
        for(int i=0; i<10 ; i++) {

            System.out.print("Introduza um numero no array[" + i + "]: ");
            vetor[i] = input.nextInt();

            // Ciclo para encontrar menor elemento
            if (vetor[i] > maiorElemento) { // Se o conteudo introduzido (vetor), introduzido em determinada posição [i] for maior que o maiorElemento,
               maiorElemento=vetor[i];      // o maiorElemento=conteudo e respetiva posição.
            }

        }
        System.out.println("O maior elemento e: " + maiorElemento);
    }
    }