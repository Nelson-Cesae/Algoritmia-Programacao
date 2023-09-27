public class Aviao {

    private String modelo;
    private int anoFabrico, serial, n_motores;
    private double peso, cmp_camuflagem, env_asas, alt_cauda, autonomia, velocidade_max, preco;

    public Aviao(String modelo, int anoFabrico, int serial, int n_motores, double peso, double cmp_camuflagem, double env_asas, double alt_cauda, double autonomia, double velocidade_max, double preco) {
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.serial = serial;
        this.n_motores = n_motores;
        this.peso = peso;
        this.cmp_camuflagem = cmp_camuflagem;
        this.env_asas = env_asas;
        this.alt_cauda = alt_cauda;
        this.autonomia = autonomia;
        this.velocidade_max = velocidade_max;
        this.preco = preco;
    }



}

