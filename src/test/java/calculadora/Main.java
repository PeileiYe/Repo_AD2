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
        assertEquals(32.20, suma.sumarDosReales(10.5, 21.7),0.01);
        suma.sumarDosReales(1.55,3.60);
        assertEquals(5.15, suma.sumarDosReales(1.55,3.60),0.01);
    }

    @Test
    void sumarDosEnteros() {
        suma.sumarDosEnteros(101, 259);
        assertEquals(360, suma.sumarDosEnteros(101, 259));
        suma.sumarDosEnteros(80,60);
        assertEquals(140, suma.sumarDosEnteros(80,60));
    }

    @Test
    void sumarTresReales() {
        suma.sumarTresReales(7.1, 11.6, 8.4);
        assertEquals(27.10, suma.sumarTresReales(7.1, 11.6, 8.4),0.01);
        suma.sumarTresReales(5.6,20.1,11.31);
        assertEquals(37.01, suma.sumarTresReales(5.6,20.1,11.3),0.01);
    }

    @Test
    void sumarAcumulado() {
        suma.sumarAcumulado(316.67);
        assertEquals(316.67, suma.getValorAcumulado(),0.01);
        suma.sumarAcumulado(100.00);
        assertEquals(416.67, suma.getValorAcumulado(),0.01);
        suma.sumarAcumulado(51.01);
        assertEquals(467.68, suma.getValorAcumulado(),0.01);
    }

    @Test
    void reiniciarValorAcumulado() {suma.reiniciarValorAcumulado();
        assertEquals(0.0, suma.getValorAcumulado());
    }

    @Test
    void multiplicarDosReales() {producto.multiplicarDosReales(1.1,2.2);
        assertEquals(2.42, producto.multiplicarDosReales(1.1,2.2), 0.01);
        producto.multiplicarDosReales(40.2,5.8);
        assertEquals(233.16, producto.multiplicarDosReales(40.2,5.8), 0.01);
    }

    @Test
    void multiplicarDosEnteros() {producto.multiplicarDosEnteros(2,14);
        assertEquals(28, producto.multiplicarDosEnteros(2,14));
        producto.multiplicarDosEnteros(8,20);
        assertEquals(160, producto.multiplicarDosEnteros(8,20));
    }

    @Test
    void multiplicarTresReales() {
        producto.multiplicarTresReales(2.2,10.5,3.4);
        assertEquals(78.54, producto.multiplicarTresReales(2.2,10.5,3.4),0.01);
        producto.multiplicarTresReales(1.1,1.1,1.1);
        assertEquals(1.331, producto.multiplicarTresReales(1.1,1.1,1.1),0.001);
    }

    @Test
    void potencia() {
        producto.potencia(5.6,3);
        assertEquals(175.62, producto.potencia(5.6,3),0.01);
        producto.potencia(20.0,2);
        assertEquals(400.00, producto.potencia(20.0,2),0.01);

    }


}