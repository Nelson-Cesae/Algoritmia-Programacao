import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio9 ***");

        // Ler variaveis
        int num, incremento;

        // Ler variavel limite
        System.out.println("Defina um valor até 50: ");
        num = input.nextInt();

        //Ler variável incremento
        System.out.println("Defina um salto para o valor: ");
        incremento = input.nextInt();

        // Programa
        while (num >= 0){
            System.out.println(num);
            num=num-incremento;

        }

}
}
