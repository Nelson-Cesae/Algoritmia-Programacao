package Ex_10;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Bruna", 3000, "Informatica");

        System.out.println("Seguem os dados da funcionária Bruna.");
        funcionario1.exibirDados();
        System.out.println ("Segue o salario da funcionária Bruna com o aumento de 10%.");
        funcionario1.aumentarSalario(0.1);
    }
}
