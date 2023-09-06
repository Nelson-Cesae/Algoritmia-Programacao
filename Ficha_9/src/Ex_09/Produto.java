package Ex_09;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeStock=0;

    /**
     * Método Construtor para um Produto
     * @param nome do Produto
     * @param preco do Produto
     */
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * Método que define a quantidade de stock de um produto
     * @return a quantidade atualizada de stock
     */
    public int getQuantidadeStock() {
        return quantidadeStock;
    }

    /**
     * Método para comprar um produto
     * @param quantidade do produto comprado
     */
    public void comprar(int quantidade){
        this.quantidadeStock+=quantidade;
    }

    /**
     * Método para vender um produto
     * @param quantidade do produto vendido
     */
    public void vender(int quantidade){
        if(this.quantidadeStock>=quantidade){
            this.quantidadeStock-=quantidade;
        } else{
            System.out.println("Não há quantidade disponivel em stock.");
        }
    }
}
