import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int num=531;

        // Programa impar
        while (num>=531 && num<=750){
            System.out.println(num);
            num=num+2;
        }
    }
}
