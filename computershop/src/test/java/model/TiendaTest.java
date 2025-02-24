package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class TiendaTest {

    @Test
    public void testContrustorTienda(){
        
        String nombre = "PcComponentes";
        String propietario = "Juan";
        String idTributario = "123456789";

        Tienda tienda = new Tienda(nombre, propietario, idTributario);

        assertEquals(nombre, tienda.getNombre());
        assertEquals(propietario, tienda.getPropietario());
        assertEquals(idTributario, tienda.getIdTributario());
        assertTrue(tienda.getOrdenadores().isEmpty());
        
    }

}
