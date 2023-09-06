package Ex_06;

public class Calculadora {

    public Calculadora() {
    }

    /**
     * Método que realiza a soma de dois numeros
     * @param num1
     * @param num2
     */
    public void adicao(double num1, double num2) {
        System.out.println("Adição:" +(num1 + num2));
    }

    /**
     * Método que realiza a subtração de dois numeros
     * @param num1
     * @param num2
     */
    public void subtracao(double num1, double num2) {
        System.out.println("Subtracao:" +(num1 - num2));
    }

    /**
     * Método que realiza a multiplicação de dois números
     * @param num1
     * @param num2
     */
    public void multiplicacao(double num1, double num2) {
        System.out.println("Multiplicacao:" +(num1 * num2));
    }

    /**
     * Método que realiza a divisão de dois números
     * @param num1
     * @param num2
     */
    public void divisao(double num1, double num2) {
        System.out.println("Divisao:" +(num1 / num2));
    }
}



