import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        //instancia obrigatoria scanner  (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);
        System.out.println("*** Exercicio2 ***");

        //Ler variaveis
        double peso, pesoLua;

        // Ler valores do utilizador
        System.out.println("Insira o seu peso:");
        peso=input.nextDouble();

        pesoLua=peso*0.16;

        //Programa
        if (pesoLua>=0) {
            System.out.println("O peso na lua é de:"+pesoLua);
        } else {
            System.out.print("Erro: o seu peso é menor que zero.");
        }

    }
}