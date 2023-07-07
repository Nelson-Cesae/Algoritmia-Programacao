package Parte_2;

import java.sql.SQLOutput;
import java.util.Scanner;

// no uses new
public class Exercicio13 {
    //no usages new
    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner (System.in); {


            // Ler variáveis
            int[][] matriz = new int[4][4];
            int somaDiagonal=0, linha, coluna;

            // Leitura da Matriz
            for (linha = 0; linha < 4; linha++) {
                for (coluna = 0; coluna < 4; coluna++) {

                    System.out.println("Introduza elementos na matriz: ");
                    matriz[linha][coluna]= input.nextInt();

                }
            }
            // Soma dos elementos da diagonal principal da Matriz
            for (linha = 0; linha < 4; linha++) {
                somaDiagonal += matriz[linha][linha];
            }
            // Exibição do resultado
            System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonal);
        }
    }
}