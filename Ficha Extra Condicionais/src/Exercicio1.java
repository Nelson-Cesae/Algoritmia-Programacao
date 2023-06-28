import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio1 ***");

        //Ler variaveis
        int idade;

        // Ler valores do utilizador
        System.out.println("Indique a sua idade:");
        idade= input.nextInt();

        //Programa
        if (idade>=18){
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }


}
}
