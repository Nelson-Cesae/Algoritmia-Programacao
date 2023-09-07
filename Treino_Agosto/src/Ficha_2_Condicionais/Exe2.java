import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        //Definir variáveis
        int salario;

        // Ler dados do utilizador
        System.out.print("Defina o seu salário:");
        salario= input.nextInt();

        // Definir o imposto a pagar sobre o salário através de uma condição

        if (salario <= 15000){
            System.out.println("O salário paga um imposto de 20%, ou seja:" +salario*0.2+"€");
        } else if(salario >= 15000){
            System.out.println("O salario paga um imposto de 30%, ou seja:" +salario*0.3+"€");
        }
    }
}