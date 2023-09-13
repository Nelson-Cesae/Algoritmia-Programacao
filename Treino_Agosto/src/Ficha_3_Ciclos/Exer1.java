import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num=2;

        // Programa par
        while (num<=300){
            System.out.println(num);
            num=num+2;
        }

    }
}