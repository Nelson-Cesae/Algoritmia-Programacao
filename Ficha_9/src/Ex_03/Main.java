package Ex_03;

public class Main {
    public static void main(String[] args) {

        Retângulo retangulo = new Retângulo(5, 5);

        // Perimetro (altura*2 + largura*2) e Area (altura*largura)

       double area = retangulo.getaltura()* retangulo.getlargura();
       double perimetro = (retangulo.getaltura()*2) + (retangulo.getaltura()*2);

       System.out.println("A area do retangulo é:" +area);
       System.out.println("O perimetro do retangulo é:" +perimetro);

    }
}
