package Parte_1;

import java.util.Scanner;

// no uses new
public class Exercicio5 {
    //no usages new
    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        // Ler as variáveis
        int[] vetor = new int[10];
        int media, soma=0;

        // Ciclo para introduzir numeros no array (ou vetor)
        for(int i=0; i<10 ; i++){
        System.out.print("Introduza um elemento no array["+i+"]: ");
        vetor[i]= input.nextInt();
        soma=soma+vetor[i];
        }

        // Calcular media aritmetica (todos os valores tem o mesmo peso)
        media=soma/10;

        System.out.println("A media dos elementos e: " +media);
    }
}