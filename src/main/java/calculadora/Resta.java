package calculadora;

/**
 * Clase que representa una calculadora de resta.
 * Proporciona métodos para restar enteros y reales.
 * @author Gonzalo Lozano Rosch (github: GLozRos)
 * @version 1.0
 */
public class Resta {

    private double valorAcumulado;

    /**
     * Constructor que inicializa el valor acumulado en 0.
     */
    public Resta() {
        this.valorAcumulado = 0;
    }

    /**
     * Resta dos números enteros y devuelve el resultado.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return El resultado de la resta de a y b.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Resta dos números de punto flotante y devuelve el resultado.
     *
     * @param a El primer número de punto flotante.
     * @param b El segundo número de punto flotante.
     * @return El resultado de la resta de a y b.
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Resta tres números de punto flotante y devuelve el resultado.
     *
     * @param a El primer número de punto flotante.
     * @param b El segundo número de punto flotante.
     * @param c El tercer número de punto flotante.
     * @return El resultado de la resta entre a, b y c.
     */
    public double restar(double a, double b, double c) {
        return a - b - c;
    }

    /**
     * Realiza una resta acumulativa y actualiza el valor acumulado.
     *
     * @param valor El valor a restar del acumulado.
     * @return El nuevo valor acumulado después de la resta.
     */
    public double restarAcumulado(double valor) {
        valorAcumulado -= valor;
        return valorAcumulado;
    }
}