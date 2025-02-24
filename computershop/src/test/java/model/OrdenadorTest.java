package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OrdenadorTest {
    @Test
    public void testConstructorOrdenador() {

        String marca = "HP";
        int memoria = 8;
        String caracteristicasProcesador = "Intel Core i5";
        String sistemaOperativo = "Windows 10";
        double precio = 1200.50;
        
        Ordenador ordenador = new Ordenador(marca, memoria, caracteristicasProcesador, sistemaOperativo, precio);

        assertEquals(marca, ordenador.getMarca());
        assertEquals(memoria, ordenador.getMemoria());
        assertEquals(caracteristicasProcesador, ordenador.getCaracteristicasProcesador());
        assertEquals(sistemaOperativo, ordenador.getSistemaOperativo());
        assertEquals(precio, ordenador.getPrecio(), 0.001);
    }
}
