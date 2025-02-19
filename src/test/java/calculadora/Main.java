package calculadora;

/**
 * Tests con Junit para las 4 clases de la calculadora con todos sus metodos
 *
 * @author Gonzalo Lozano Rosch (github: GLozRos)
 * @author Peilei Ye Jin (github: PeileiYe)
 * @version 2.0
 *<p>Repositorio GitHub: https://github.com/PeileiYe/Repo_AD2</p>
 *
 * @version 2.0
 * <p>Principales cambios: </p>
 * <pre>simplificado los tests utilizando solo assertThrows y assetEquals;</pre>
 * <pre>añadido argumento delta para controlar resultados;</pre>
 *
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main {

    private Suma suma;
    private Producto producto;
    private Resta resta;
    private Cociente cociente;


    @BeforeEach void setUp() {
        suma = new Suma();
        producto = new Producto();
        resta = new Resta();
        cociente = new Cociente();
    }

    /**Tests para la clase suma*/

        @Test
    void sumarDosReales() {
            assertEquals(8.5, suma.sumarDosReales(3.1, 5.4),0.01);
            assertEquals(3.33, suma.sumarDosReales(1.22,2.11),0.01);
        }

    @Test
    void sumarDosEnteros() {
            assertEquals(89, suma.sumarDosEnteros(78,11));
            assertEquals(14, suma.sumarDosEnteros(9,5));
        }


    @Test
    void sumarTresReales() {
        assertEquals(3.15, suma.sumarTresReales(1.01, 1.04, 1.1),0.01);
        assertEquals(18.6, suma.sumarTresReales(3.2,7.2,8.2),0.01);
    }

    @Test
    void sumarAcumulado() {
        assertEquals(5.00,suma.sumarAcumulado(5.00),0.01);
        assertEquals(6.10,suma.sumarAcumulado(1.10),0.01);
        assertEquals(7.35,suma.sumarAcumulado(1.25),0.01);
    }

    @Test
    void reiniciarValorAcumulado() {
        suma.reiniciarValorAcumulado();
        assertEquals(0.0, suma.getValorAcumulado());
    }

    /** Tests para la clase Producto */

    @Test
    void multiplicarDosReales() {
        producto.multiplicarDosReales(1.1,2.2);
        assertEquals(2.42, producto.multiplicarDosReales(1.1,2.2), 0.01);
        producto.multiplicarDosReales(40.2,5.8);
    }

    @Test
    void multiplicarDosEnteros() {
        assertEquals(12, producto.multiplicarDosEnteros(3,4));
        assertEquals(365, producto.multiplicarDosEnteros(73,5));
    }

    @Test
    void multiplicarTresReales() {
        assertEquals(50.82, producto.multiplicarTresReales(5.5,4.4,2.1),0.01);
        assertEquals(35.397, producto.multiplicarTresReales(3.3,3.3,3.3),0.01);
    }

    @Test
    void potencia() {
        assertEquals(144, producto.potencia(12,2),0.01);
        assertEquals(35.937, producto.potencia(3.3,3),0.01);
    }


    /** Tests para la clase Resta */

    @Test
    void restarDosEnteros() {
        assertEquals(5, resta.restar(10, 5));
        assertEquals(8, resta.restar(23, 15));
    }

    @Test
    void restarDosReales() {
        assertEquals(6.3, resta.restar(10.5, 4.2), 0.0001);
        assertEquals(5.31, resta.restar(15.31, 10.00), 0.0001);
    }

    @Test
    void restarTresReales() {
        assertEquals(5.2, resta.restar(20.5, 10.1, 5.2), 0.0001);
        assertEquals(33.32, resta.restar(48.67, 10.13, 5.22), 0.0001);
    }

    @Test
    void restarAcumulado() {
        assertEquals(-5.0, resta.restarAcumulado(5.0));
        assertEquals(-7.5, resta.restarAcumulado(2.5));
        assertEquals(-12.6,resta.restarAcumulado(5.1));
    }
    
   /** Tests para la clase Cociente */

    @Test
    void dividirDosReales() {
        assertEquals(2.5, cociente.dividir(10.0, 4.0), 0.0001);
        assertEquals(3.3, cociente.dividir(16.5, 5.0), 0.0001);

    }

    @Test
    void dividirDosEnteros() {
        assertEquals(5, cociente.dividir(10, 2));
        assertEquals(4, cociente.dividir(20, 5));
    }

    @Test
    void divisionPorCero() {
        assertThrows(ArithmeticException.class, () -> cociente.dividir(10, 0));
        assertThrows(ArithmeticException.class, () -> cociente.dividir(20.1, 0));
    }


    @Test
    void inverso() {
        assertEquals(0.25, cociente.inverso(4), 0.0001);
        assertEquals(0.2, cociente.inverso(5), 0.0001);
    }

    @Test
    void raiz() {
        assertEquals(4, cociente.raiz(16), 0.0001);
        assertEquals(25, cociente.raiz(625), 0.0001);
    }

    @Test
    void raizNumeroNegativo() {
        assertThrows(IllegalArgumentException.class, () -> cociente.raiz(-1));
        assertThrows(IllegalArgumentException.class, () -> cociente.raiz(-16));
    }

}