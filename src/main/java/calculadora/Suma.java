package calculadora;

/**
 * Implementa métodos relacionados con la suma de la calculadora.
 *
 *<p>Ejemplo de uso:</p>
 * <pre>{@code
 * Suma suma1 = new Suma ();
 * System.out.println(suma1.sumar(double num1, double num2));
 * }</pre>
 *
 * @author Peilei Ye Jin (aka PeileiYe@github.com)
 * @version 1.0
 */

public class Suma {

    private double valorAcumulado =0.0;

    /**
     * Constructor por defecto
     */
    public Suma() {
        super();
    }

    /**
     * Sumar dos números reales.
     *
     * @param num1 Primer número real.
     * @param num2 Segundo número real.
     * @return La suma de los dos números reales.
     */
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Sumar dos números enteros.
     *
     * @param num1 Primer número entero.
     * @param num2 Segundo número entero.
     * @return La suma de los dos números enteros.
     */
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Sumar tres números reales.
     *
     * @param num1 Primer número real.
     * @param num2 Segundo número real.
     * @param num3 Tercer número real.
     * @return La suma de los tres números reales.
     */
    public double sumar(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    /**
     * Sumar con valor acumulado.
     *
     * @param num El numero real a sumar al valor acumulado.
     * @return El nuevo valor acumulado.
     */
    public double sumarAcumulado(double num) {
        valorAcumulado += num;
        return valorAcumulado;
    }

    /**
     * Devuelve el valor acumulado actual.
     *
     *  @return El valor acumulado actual.
     */
    public double getValorAcumulado() {
        return valorAcumulado;
    }

    /**
     * Reinicia el valor acumulado a 0.
     */
    public void reiniciarValorAcumulado() {
        valorAcumulado = 0.0;
    }
}

