import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio4 ***");

        // Ler variaveis
        int iniciointervalo, fimintervalo, numero;

        // Ler intervalos
        System.out.print("Diga o valor do inicio do intervalo: ");
        iniciointervalo= input.nextInt();

        System.out.print("Diga o valor do fim do intervalo: ");
        fimintervalo= input.nextInt();

        numero=iniciointervalo;

        // Programa
        while (numero <= fimintervalo) {
            System.out.println(numero);
            numero++;
        }


}
}
