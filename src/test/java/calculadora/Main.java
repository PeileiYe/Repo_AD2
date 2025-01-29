package calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Main {

    private Suma suma;
    private Double valorAcumulado = 0.0;

    @BeforeEach
    void setUp() {
        suma = new Suma();
    }

    @Test
    void sumarDosReales() {
        suma.sumarDosReales(10.5, 21.7);
        assertEquals(32.2, suma.sumarDosReales(10.5, 21.7));
    }

    @Test
    void sumarDosEnteros() {
        suma.sumarDosEnteros(101, 259);
        assertEquals(360, suma.sumarDosEnteros(101, 259));
    }

    @Test
    void sumarTresReales() {
        suma.sumarTresReales(7.1, 11.6, 8.4);
        assertEquals(27.1, suma.sumarTresReales(7.1, 11.6, 8.4));
    }

    @Test
    void sumarAcumulado() {
        suma.sumarAcumulado(316.67);
        assertEquals(316.67, suma.getValorAcumulado());
        suma.sumarAcumulado(100.00);
        assertEquals(416.67, suma.getValorAcumulado());
        suma.sumarAcumulado(51.01);
        assertEquals(467.68, suma.getValorAcumulado());
    }

    @Test
    void reiniciarValorAcumulado() {suma.reiniciarValorAcumulado();
        assertEquals(0.0, suma.getValorAcumulado());
    }
}