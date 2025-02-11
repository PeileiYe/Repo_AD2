package calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Main {

    private Suma suma;
    private Producto producto;


    @BeforeEach
    void setUp() {
        suma = new Suma();
        producto = new Producto();
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

    @Test
    void multiplicarDosReales() {producto.multiplicarDosReales(1.1,2.2);
        assertEquals(2.42, producto.multiplicarDosReales(1.1,2.2), 0.01);
    }

    @Test
    void multiplicarDosEnteros() {producto.multiplicarDosEnteros(2,14);
        assertEquals(28, producto.multiplicarDosEnteros(2,14));
    }

    @Test
    void multiplicarTresReales() {producto.multiplicarTresReales(2.2,10.5,3.4);
        assertEquals(78.54, producto.multiplicarTresReales(2.2,10.5,3.4),0.01);
    }

    @Test
    void potencia() {producto.potencia(5.6,3);
        assertEquals(175.62, producto.potencia(5.6,3),0.01);

    }
}