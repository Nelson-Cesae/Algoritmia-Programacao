package Parte_1;

import java.sql.SQLOutput;
import java.util.Scanner;

// no uses new
public class Exercicio7 {
    //no usages new
    public static void main(String[] args) {
        // Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        // Ler as variáveis
        int[] vetor = new int[10];
        int i=0, maiorPar=0;
        boolean primeiroPar=true;


        // Leitura do Array - aqui dizemos que o elemento (i) começa a 0, tem de ser menos de 10 numeros, e pede sempre para colocar mais 1 ao utlizador até 10;
        for (i = 0; i < 10; i++) {
            System.out.print("Digite o elemento no array ["+i+"]: ");
            vetor[i] = input.nextInt();

            if(vetor[i]%2==0 && primeiroPar){  // Aqui definimos, dentro do ciclo for (para rodar sempre, verificar sempre) a condição (if) que se o elemento no vetor for,
                maiorPar=vetor[i];             // par e for o primeiro par (boleano definido com verdadeiro), definimos que o "maior par" é inicializada a x(vetor[i] que o utilizador
                primeiroPar=false;             // definiu na consola - o maior foi inicializado a "maior par"); O boolean a false é para que o primeiro numero par colocado não seja tido
                System.out.println("Maior foi inicializado a: "+maiorPar); //como o maior, porque o utilizador pode ao longo do array definir um maior;
            }

            System.out.println("A efetuar comparacao: "+vetor[i]+">"+maiorPar); // Aqui efetuamos a comparação entre o elemento colocado pelo utilizador [i] e o numero definido como maiorPar;

            if (vetor[i]%2==0 && vetor[i]>maiorPar) { // Aqui definimos uma condição fora do ciclo for de cima porque se eventualmente colocarmos um novo numero par e este for maior
                maiorPar=vetor[i];                    // que o anteriror, temos de definir o atual como maior;
                System.out.println("Maior foi mudado para: "+maiorPar);
            }
        }

        System.out.println ("O maior numero par é:" +maiorPar); // Aqui definimos que o maior numero par do array é X;

    }
}