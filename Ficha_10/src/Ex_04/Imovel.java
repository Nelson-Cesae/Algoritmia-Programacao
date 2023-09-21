package Ex_04;

public class Imovel {

    private String rua, cidade;
    private int numPorta, numQuartos, numWC;
    private double area, areaPool;

    private Tipo tipoImovel;
    private Acabamento acabamento;


    /**
     * Método construtor para um Imóvel
     * @param rua onde se situa o Imóvel
     * @param cidade onde se situa o Imóvel
     * @param numPorta do Imóvel
     * @param numQuartos do Imóvel
     * @param numWC do Imóvel
     * @param area do Imóvel
     * @param areaPool do Imóvel
     */
    public Imovel(String rua, String cidade, int numPorta, int numQuartos, int numWC, double area, double areaPool) {
        this.rua = rua;
        this.cidade = cidade;
        this.numPorta = numPorta;
        this.numQuartos = numQuartos;
        this.numWC = numWC;
        this.area = area;
        this.areaPool = areaPool;
    }


public double calcularValor (){

        // Declarar
        double Valor = 0;

        // Aumentar o valor com a area do imovel

}

}
