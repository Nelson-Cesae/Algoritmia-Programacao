package Parte_1;

import java.util.Scanner;

// no uses new
public class Exercicio2 {
    //no usages new
    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        // Declarar Variáveis
        int[] preco = new int[10];
        int soma=0;

        // Ciclo para introduzir numeros no array (ou vetor)
        for(int i=0; i<10 ; i++){

            System.out.print("Introduza um preço no array["+i+"]: ");
            preco[i]= input.nextInt();
            soma=soma+preco[i]; // o "i" é só o index do array! O conteúdo, neste caso,
        }                       // é a variavel preço + o i[posição daquele conteúdo dentro do array.

        // Imprimir e calcular o preço
            System.out.println("Soma: "+soma);

    }
}