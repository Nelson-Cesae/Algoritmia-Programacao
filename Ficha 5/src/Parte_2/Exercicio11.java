package Parte_2;

import java.sql.SQLOutput;
import java.util.Scanner;

// no uses new
public class Exercicio11 {
    //no usages new
    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner (System.in); {

        // Ler as variáveis
            int[][] matriz = new int[3][3];
            int linha=0, coluna=0, maiorValor=0, menorValor=0;

            // Ciclo para introduzir os elementos na Matriz pelo utilizador
            for (linha = 0; linha < 3; linha++) {
                for (coluna = 0; coluna < 3; coluna++) {
                    System.out.println("Introduza elementos na matriz: ");
                    matriz[linha][coluna] = input.nextInt();
                }
            }

            // Ciclo para encontrar o maior e o menor valor da matriz
            for (linha = 0; linha < 3; linha++) {
                for (coluna = 0; coluna < 3; coluna++) {
            if (matriz[linha][coluna] > maiorValor){
                maiorValor=matriz[linha][coluna]; // perguntar se dá para colocar o operador != diferente de 0.
            } if (matriz[linha][coluna] < menorValor){
                menorValor=matriz[linha][coluna];
            }
                }
            }
            System.out.println("O maior valor guardado na matriz e: " + maiorValor +"e o menor e" +menorValor);
        }
}
    }