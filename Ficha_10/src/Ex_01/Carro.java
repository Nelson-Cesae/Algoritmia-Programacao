package Ex_01;

public class Carro {
        private String marca;
        private String modelo;
        private int ano;
        private int potencia;
        private int cilindrada;
        private TipoCombustivel combustivel;
        private double consumo;

    /**
     * Método construtor de um carro
     * @param marca do carro
     * @param modelo do carro
     * @param ano de fabrico carro
     * @param potencia do carro(CV)
     * @param cilindrada cilindrada (CC)
     * @param combustivel de combustivel
     * @param consumo de combustivel(l/100km)
     */
    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel combustivel, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.consumo = consumo;
    }

    public void ligar () {
        if (this.ano >= 1993) { // caso seja recente

        }
        if (this.potencia >= 250) { // avaliar a potencia
            System.out.println("O carro está ligado!"); // carro + potente
            System.out.println("“VRUUMMMMMM”");
        } else {
            System.out.println("O carro está ligado!"); // carro - potente
            System.out.println("Vruummmmmmm");
        }

        if (this.combustivel.equals(TipoCombustivel.DIESEL)) {
            System.out.println("Deita um pouco de fumo… Custa a pegar… O carro está ligado!");
            System.out.println("Vrum-vrum-vrum");
        } else {
            System.out.println("Custa a pegar… O carro está ligado!");
            System.out.println("Vrum-vrum-vrum");
        }
    }

    /**
     * Método para fazer uma corrida de carros
     * @param adversario Carro adversário para a corrida
     * @return o vencedor da corrida
     */
        public Carro corrida(Carro adversario){
            if(this.potencia>adversario.potencia){
                return this;
            }else{
                if(adversario.potencia>this.potencia){
                    return adversario;
                }else{

                    if(this.cilindrada>adversario.cilindrada){
                        return this;
                    }else {
                        if(adversario.cilindrada>this.cilindrada){
                            return adversario;
                        }else {

                            if(this.ano>adversario.ano){
                                return this;
                            }else{
                                if(adversario.ano>this.ano){
                                    return adversario;
                                }else {
                                    return null;
                                }
                            }
                        }
                    }
                }
            }
        }

    /**
     * Método que imprime na consola todos os detalhes de um carro
     */
    public void exibirDetalhes(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano: "+this.ano);
        System.out.println("Potencia: "+this.potencia);
        System.out.println("Cilindrada: "+this.cilindrada);
        System.out.println("Tipo de Combustivel: "+this.combustivel);
        System.out.println("L/100Km: "+this.consumo+"L");
    }

    }


