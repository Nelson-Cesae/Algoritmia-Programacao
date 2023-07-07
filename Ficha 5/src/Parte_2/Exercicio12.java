package Parte_2;

import java.sql.SQLOutput;
import java.util.Scanner;

// no uses new
public class Exercicio12 {
    //no usages new
    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner (System.in); {

            // Ler as variáveis
            int[] vetor1 = new int[10];
            int[] vetor2 = new int[10];
            int linha=0, coluna=0;

            // Ciclo para ler os Arrays
            for(int i=0; i<10 ; i++) {
                System.out.print("Introduza um numero no array[" + i + "]: ");
                vetor1[i] = input.nextInt();
            }

            for(int i=0; i<10 ; i++) {
                System.out.print("Introduza um numero no array[" + i + "]: ");
                vetor2[i] = input.nextInt();
            }


            // Declarar e ler a matriz em função dos arrays
            int[][] matriz = new int[10][2]; // Aqui definimos (declaramos) a matriz de acordo com o pedido no exercicio e com os arrays de cima.
            for (linha=0; linha< matriz.length; linha++){
                matriz[linha][0] = vetor1[linha]; // O primeiro elemento da matriz é a linha e o segundo é a coluna (que está a 0 e 1) porque fixamos por serem apenas 2 colunas [10][2].
                matriz[linha][1] = vetor2[linha]; // As linhas o ciclo vai ler até completar as 10.
            }

            // Ciclo para imprimir a matriz
            for(linha=0; linha<10 ; linha++) {
                for (coluna = 0; coluna < 2; coluna++){
                    System.out.print("\t"+matriz[linha][coluna]);
                }
                System.out.println(); // Para sair em matriz o System.out.println tem de estar dentro do primeiro FOR!
            }
        }
    }
}
