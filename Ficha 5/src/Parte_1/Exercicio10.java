package Parte_1;

import java.sql.SQLOutput;
import java.util.Scanner;

// no uses new
public class Exercicio10 {
    //no usages new
    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        // Ler as variáveis
        int[][] matriz = new int[4][5];
        int linha=0, coluna=0, num=0;

        // Ciclo para introduzir os elementos na Matriz
        for (linha = 0; linha < 4; linha++) {
            for (coluna = 0; coluna < 5; coluna++) {
            System.out.println("Introduza elementos na matriz: ");
            matriz[linha][coluna] = input.nextInt();
        }
        }

        // Imprimir os elementos da Matriz

        for (linha = 0; linha < 4; linha++) {
            for (coluna = 0; coluna < 5; coluna++) {
                System.out.print("\t"+matriz[linha][coluna]);

    }
            System.out.println();
}
        System.out.println("Introduza um valor:");
        num = input.nextInt();
        if (num==matriz[linha][coluna]){

        }
    }
}