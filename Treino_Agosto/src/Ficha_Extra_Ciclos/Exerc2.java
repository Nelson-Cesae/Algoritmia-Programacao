import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Ler variáveis
        int num;

        // Programa
        for (num=1; num<=255; num++){
            System.out.println(num*3);
        }
    }
}