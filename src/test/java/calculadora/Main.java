package calculadora;

/**
 * Tests para las clases de Resta y Cociente.
 *
 * @author Peilei Ye Jin (aka PeileiYe@github.com)
 * <p>Repositorio GitHub: https://github.com/PeileiYe/Repo_AD2</p>
 *
 * @version 2.0
 * <p>Principales cambios: </p>
 * <pre>simplificado los tests utilizando solo assertThrows y assetEquals;</pre>
 * <pre>añadido argumento delta para controlar resultados;</pre>
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Main {
    private Resta resta;
    private Cociente cociente;


    @BeforeEach
    void setUp() {
        resta = new Resta();
        cociente = new Cociente();
    }

    /**
     * Tests clase Cociente.
     */

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


    /**
     * Tests clase Resta.
     */

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
}