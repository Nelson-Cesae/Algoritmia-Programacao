package Parte_2;

import java.sql.SQLOutput;
import java.util.Scanner;

// no uses new
public class Exercicio8 {
    //no usages new
    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        // Ler as variáveis
        int[ ][ ] matriz = new int[3] [3];
        int linha, coluna;

        matriz[0][0]= 5;  // Neste exercicio eu defini os elementos da matriz (não fiz o System.out.println(Define os elelemntos...));
        matriz[0][1]= 7;
        matriz[0][2]= 8;

        matriz[1][0]= 6;
        matriz[1][1]= 4;
        matriz[1][2]= 2;

        matriz[2][0]= 1;
        matriz[2][1]= 4;
        matriz[2][2]= 7;


        // Imprimir a matriz [3][3]
        for (linha = 0; linha < matriz.length; linha++) { // usamos o ciclo de repetição for, definimos o elemento(matriz) como 0, definimos a condição (linha tem de ser menor que tamanho do total da linha da matriz) e adiciona 1 até ao limite.
            for (coluna = 0; coluna < matriz[0].length; coluna++) { // aqui fizemos o mesmo de cima mas para a coluna. Depois imprimimos (o "\t" é um tab, separa(dá espaço) linhas e colunas.
                System.out.print("\t"+matriz[linha][coluna]);
            }
            System.out.println(); // Voltamos a imprimir aqui para não sair a matriz em linha mas sim como o exercicio pede.
        }



    }
}
