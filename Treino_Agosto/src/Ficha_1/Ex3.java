import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        double area, perimetro, comprimento, largura;

        // Ler do utilzador as dimensões
        System.out.print("Defina o comprimento:");
        comprimento= input.nextDouble();

        System.out.print("Defina a largura:");
        largura= input.nextDouble();

        // Calcular a area e apresentar resultado

        area=comprimento*largura;
        System.out.println("A área do retangulo é de:" +area);

        // Calcular o perimetro e apresentar resultado

        perimetro=(comprimento*2)+(largura*2);
        System.out.println("O perimetro do retangulo é de:" +perimetro);
    }
}