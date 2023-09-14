package Ex_02;

public class Conta {

    private String numeroConta;
    private double saldo = 0;
    private String titular;
    private int anoAbertura = 2023;
    private double margemEmprestimo = 0;
    private double valorDivida=0;

    /**
     * Construtor para uma possível conta
     * @param numeroConta IBAN
     * @param titular Nome do titular da conta
     */
    public Conta(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;

    }

    /**
     * Método para depositar um valor na conta
     * @param valor a ser depositado na conta
     */
    public void depositar(double valor) {
        this.saldo += valor;
        this.margemEmprestimo=this.saldo*0.9;
        System.out.println("Depósito efetuado.");
    }

    /**
     * Método para levantar um valor da conta
     * @param valor a ser levantado na conta
     */
    public void levantar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            this.margemEmprestimo=this.saldo*0.9;
            System.out.println("Levantamento efetuado.");
        } else {
            System.out.println("Levantamento recusado. Não tem saldo suficiente.");
        }
    }

    /**
     * Método para transferir um valor de uma conta para outra
     * @param contaDestino do valor a ser transferido
     * @param valor a ser transferido
     */
    public void transferencia(Conta contaDestino, double valor) {
        if (this.saldo >= valor) {
            System.out.println("Transferencia concluida.");
            this.saldo -= valor;
            this.margemEmprestimo=this.saldo*0.9;

            contaDestino.saldo += valor;
            contaDestino.margemEmprestimo=contaDestino.saldo*0.9;
        } else {
            System.out.println("Transferência recusada. Saldo insuficiente.");
        }
    }

    /**
     * Método que define a viabilidade de um pedido de empréstimo
     * @param valorPedir no empréstimo
     */
        public void pedirEmprestimo (double valorPedir){
            if(valorDivida==0 && valorPedir<=margemEmprestimo){
                this.saldo+=valorPedir;
                valorDivida=valorPedir;
                System.out.println("Emprestimo concedido.");
            } else {
                System.out.println("Emprestimo recusado.");
            }
        }

    /**
     * Método para exibir os detalhes da Conta
     */
    public void exibirDetalhes(){
        System.out.println("Titular da conta: "+this.titular);
        System.out.println("Numero da Conta: "+this.numeroConta);
        System.out.println("Saldo atual da Conta: "+this.saldo);
    }
    }

