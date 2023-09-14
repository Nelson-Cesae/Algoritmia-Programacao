package Ex_02;

public class Main {

    public static void main(String[] args) {

        // Instanciar contas
        Conta conta1 = new Conta ("12345", "Maria");
        Conta conta2 = new Conta ("67899", "Ze");

        // Exibir detalhes conta1

        conta1.exibirDetalhes();
        System.out.println();

        // Depositar
        conta1.depositar(1000);
        conta1.exibirDetalhes();
        System.out.println();

        // Levantar
        conta1.levantar(100);
        conta1.exibirDetalhes();
        System.out.println();

        // Transferir
        conta1.transferencia(conta2,400);
        conta1.exibirDetalhes();
        System.out.println();
        conta2.exibirDetalhes();
        System.out.println();

        // Emprestimo
        conta1.pedirEmprestimo(400);
        conta1.exibirDetalhes();
    }
}
