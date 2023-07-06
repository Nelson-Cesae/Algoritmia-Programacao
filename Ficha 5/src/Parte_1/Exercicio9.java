package Parte_1;

import java.sql.SQLOutput;
import java.util.Scanner;

// no uses new
public class Exercicio9 {
    //no usages new
    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        // Ler as variáveis
        int[ ][ ] matriz = new int[5] [5];
        int soma=0, linha, coluna;

        // Soma de todos os elementos da Matriz
        for (linha = 0; linha < 5; linha++) { // O "i" aqui é substituido por linha e coluna porque as matrizes são compostas pelas mesmas.
            for (coluna = 0; coluna < 5; coluna++) {

            System.out.println("Introduza elementos na matriz: ");
            matriz[linha][coluna]= input.nextInt();
            soma=soma+matriz[linha][coluna];
    }
}
        System.out.println("Total: "+soma);

    }
}