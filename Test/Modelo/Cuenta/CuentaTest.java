package Modelo.Cuenta;

import Modelo.Menu.ProductoCarta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void crearFactura() {
        Cuenta cuenta = new Cuenta();
        assertAll( () -> assertThrows(RuntimeException.class, () -> cuenta.CrearFactura()));
        Comanda comanda = new Comanda();
        comanda._importe = 10.0;
        cuenta._comandas.add(comanda);
        cuenta.CalcularImporte();
        cuenta.CrearFactura();
        assertAll( () -> assertEquals(10.0, cuenta._factura._importe));
    }

    @Test
    void calcularImporte() {
        Cuenta cuenta = new Cuenta();
        Comanda comanda = new Comanda();
        assertAll( () -> assertThrows(RuntimeException.class, () -> cuenta.CalcularImporte()));
        comanda._importe = 10.0;
        cuenta._comandas.add(comanda);
        assertAll( () -> assertEquals(10.0, cuenta.CalcularImporte()));
    }
}