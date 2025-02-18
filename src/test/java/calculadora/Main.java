<<<<<<< HEAD
=======
package calculadora;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class Main {

    private Suma suma;
    private Producto producto;


    @BeforeEach void setUp() {
        suma = new Suma();
        producto = new Producto();
    }

    /*Tests para la clase suma */

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

    /* Tests para la clase Producto */

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
}
>>>>>>> gonzalo
