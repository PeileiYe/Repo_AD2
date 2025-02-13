package calculadora;

/**
 * Clase que representa una calculadora de cociente.
 * Proporciona métodos para realizar divisiones con números enteros y reales,
 * calcular el inverso de un número y obtener la raíz cuadrada.
 *
 * @author Gonzalo Lozano Rosch (github: GLozRos)
 * @version 1.0
 */
public class Cociente {

    /**
     * Realiza la división de dos números enteros.
     *
     * @param a El dividendo (número entero).
     * @param b El divisor (número entero, distinto de 0).
     * @return El resultado de la división de a entre b.
     * @throws ArithmeticException Si el divisor es 0.
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }

    /**
     * Realiza la división de dos números reales.
     *
     * @param a El dividendo (número real).
     * @param b El divisor (número real, distinto de 0).
     * @return El resultado de la división de a entre b.
     * @throws ArithmeticException Si el divisor es 0.
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }

    /**
     * Calcula el inverso de un número real.
     *
     * @param a El número real (distinto de 0).
     * @return El inverso de a.
     * @throws ArithmeticException Si el número es 0.
     */
    public double inverso(double a) {
        if (a == 0) {
            throw new ArithmeticException("No se puede calcular el inverso de cero.");
        }
        return 1 / a;
    }

    /**
     * Calcula la raíz cuadrada de un número.
     *
     * @param a El número del cual se calculará la raíz cuadrada (debe ser >= 0).
     * @return La raíz cuadrada de a.
     * @throws IllegalArgumentException Si el número es negativo.
     */
    public double raiz(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(a);
    }

}
