import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int [][] matriz = new int [5][5];
        int soma=0;

        // // Ciclo para intoduzir numeros na matriz
        for (int linha=0; linha<5; linha++){
            for (int coluna=0; coluna<5; coluna++){
                System.out.println("Introduza o numero na matriz ["+linha+"]["+coluna+"]:");
                matriz[linha][coluna]= input.nextInt();
                soma=soma+matriz[linha][coluna];
            }
        }
        System.out.println("A soma dos numeros da matriz é:" +soma);
    }
}