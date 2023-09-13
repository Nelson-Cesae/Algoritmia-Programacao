import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        double[] preco = new double[10];
        double total=0;

        // Ciclo para intoduzir precos no array e calcular o total
        for (int i=0; i<10; i++){
            System.out.println("Introduza um preço no vetor ["+i+"]:");
            preco[i]= input.nextDouble();
            total=total+preco[i];
        }

        System.out.println("Preço total:"+total);
        }
    }
