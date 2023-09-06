package Ex_10;

public class Funcionario {

    private String Nome;
    private double salario;
    private String departamento;

    /**
     * Método Construtor para um Funcionario
     * @param nome do Funcionário
     * @param salario do Funcionário
     * @param departamento onde trabalha o Funcionário
     */
    public Funcionario(String nome, double salario, String departamento) {
        Nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    /**
     * Método para aumentar o funcionário do funcionário
     * @param valor Percentual relativo ao aumento
     */
    public void aumentarSalario(double valor){
        this.salario=salario+salario*valor;
        System.out.println("Salario com aumento: " +this.salario);
    }

    /**
     * Método para exibir os dados do funcionário
     */
    public void exibirDados(){
        System.out.println("Nome: " +Nome);
        System.out.println("Salario: " +salario);
        System.out.println("Departamento: "+departamento);
    }
}
