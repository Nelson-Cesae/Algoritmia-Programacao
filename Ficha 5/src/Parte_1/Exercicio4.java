package Parte_1;

import java.util.Scanner;

// no uses new
public class Exercicio4 {
    //no usages new
    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        // Declarar as variáveis
        int[] vetor = new int[10];
        int menorElemento;

        System.out.print("Introduza um numero no array[" + 0 + "]: ");
        vetor[0] = input.nextInt();
        menorElemento=vetor[0]; // Aqui definimos a posição 0 do vetor como menor elemento.

        // Ciclo para introduzir numeros no array (ou vetor)
        for(int i=1; i<10 ; i++) {

            System.out.print("Introduza um numero no array[" + i + "]: ");
            vetor[i] = input.nextInt();

            // Ciclo para encontrar menor elemento
            if (vetor[i] < menorElemento) {
                menorElemento=vetor[i];
            }

        }
        System.out.println("O menor elemento e: " + menorElemento);
    }
}
