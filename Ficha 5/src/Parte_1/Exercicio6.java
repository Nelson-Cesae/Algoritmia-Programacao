package Parte_1;

import java.util.Scanner;

// no uses new
public class Exercicio6 {
    //no usages new
    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        // Ler variáveis
        int[] vetor = new int[10];
        int c=0;

        // Ciclo para introduzir numeros no array (ou vetor)
        for(int i=0; i<10 ; i++){
            System.out.print("Introduza um elemento no array(vetor)["+i+"]: ");
            vetor[i]= input.nextInt();

        }

        //// Ciclo para colocar os elementos em ordem crescente
                if(vetor<c && a<c){ // a ... ...
                    if( b<c){ // abc
                        System.out.println(a+" "+b+" "+c);
                    }else{ // acb
                        System.out.println(a+" "+c+" "+b);
                    }
                }


                if(b<a && b<c) { // b ... ...
                    if(a<c){ // bac
                        System.out.println(b+" "+a+" "+c);
                    }else{ // bca
                        System.out.println(b+" "+c+" "+a);
                    }
                }


                if(c<a && c<b){ // c ... ...
                    if(a<b){ // cab
                        System.out.println(c+" "+a+" "+b);
                    }else{ // cba
                        System.out.println(c+" "+b+" "+a);
                    }
                }

                break;

    }
}