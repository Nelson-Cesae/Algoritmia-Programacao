package Ex_11;

public class Conta {

    private String numeroConta;
    private double saldo=0;
    private String titular;

    /**
     * Construtor para um conta
     * @param numeroConta IBAN
     * @param titular Nome do titular da Conta
     */

    public Conta(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    /**
     * Método para transferir um valor de uma conta para outra
     * @param contaDestino do valor a ser tansferido
     * @param valor a ser transferido
     */
    public void transferencia(Conta contaDestino, double valor){
        if(this.saldo>=valor){
            System.out.println("Transferencia concluida.");
            this.saldo-=valor;
            contaDestino.saldo+=valor;
        } else{
            System.out.println("Transferência recusada. Saldo insuficiente.");
        }
    }

    /**
     * Método para levantar um valor da conta
     * @param valor a ser levantado da conta
     */
    public void levantar(double valor){
        if(this.saldo>=valor){
            this.saldo-=valor;
            System.out.println("Levantamento efetuado.");
        } else{
            System.out.println("Levantamento recusado. Não tem saldo suficiente.");
        }
    }

    /**
     * Método para depositar um valor na conta
     * @param valor a ser depositado na conta
     */
    public void depositar(double valor){
        this.saldo+=valor;
        System.out.println("Depósito efetuado." );
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
