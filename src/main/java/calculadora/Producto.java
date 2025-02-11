package calculadora;
import java.text.DecimalFormat;

/**
 * Representa los métodos relacionados con la multiplicación de la calculadora.
 *
 *<p>Ejemplo de uso:</p>
 * <pre>{@code
 * Producto producto1 = new Producto();
 * System.out.println(producto1.multiplicar(double num1, double num2));
 * }</pre>
 *
 * @author Peilei Ye Jin (aka PeileiYe@github.com)
 * @version 1.0
 */

public class Producto {

    /**
     * Realiza el producto de dos números reales.
     *
     * @param num1 Primer número real.
     * @param num2 Segundo número real.
     * @return El producto de los dos números reales.
     */
    public double multiplicarDosReales(double num1, double num2) {
        return Math.round(num1 * num2*100.0) / 100.0;
    }

    /**
     * Realiza el producto de dos números enteros.
     *
     * @param num1 Primer número entero.
     * @param num2 Segundo número entero.
     * @return El producto de los dos números enteros.
     */
    public int multiplicarDosEnteros(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Realiza el producto de tres números reales
     *
     * @param num1 Primer número real.
     * @param num2 Segundo número real.
     * @param num3 Tercer número real.
     * @return El producto de los tres números reales.
     */
    public double multiplicarTresReales(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }

    /**
     * Calcula la potencia de un número base elevado a un exponente.
     *
     * @param base      El número base.
     * @param exponente El exponente al que se eleva la base.
     * @return El resultado de la operación de potencia.
     */
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

}
