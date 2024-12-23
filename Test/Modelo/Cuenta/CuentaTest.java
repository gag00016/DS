package Modelo.Cuenta;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    /**
     * Prueba el metodo {Cuenta.CrearFactura()}.
     * Verifica los siguientes casos:
     *     Lanzamiento de una excepción si el importe es 0.
     *     Creación de una factura válida si el importe es mayor a 0.
     */
    @Test
    void crearFactura() {
        Cuenta cuenta = new Cuenta();
        // Verifica que se lanza una excepción al intentar crear una factura con importe 0.
        assertAll(() -> assertThrows(RuntimeException.class, () -> cuenta.CrearFactura()));

        // Agrega una comanda con importe positivo y recalcula el importe.
        Comanda comanda = new Comanda();
        comanda._importe = 10.0;
        cuenta._comandas.add(comanda);

        cuenta.CalcularImporte();
        cuenta.CrearFactura();

        // Verifica que la factura creada tiene el importe esperado.
        assertAll(() -> assertEquals(10.0, cuenta._factura._importe));
    }

    /**
     * Prueba el metodo {Cuenta.CalcularImporte()}.
     * Verifica los siguientes casos:
     *     Lanzamiento de una excepción si no hay comandas y el importe es 0.
     *     Cálculo correcto del importe sumando los importes de las comandas asociadas.
     */
    @Test
    void calcularImporte() {
        Cuenta cuenta = new Cuenta();
        Comanda comanda = new Comanda();

        // Verifica que se lanza una excepción si el importe es 0.
        assertAll(() -> assertThrows(RuntimeException.class, () -> cuenta.CalcularImporte()));

        // Agrega una comanda con importe positivo y verifica el cálculo.
        comanda._importe = 10.0;
        cuenta._comandas.add(comanda);
        assertAll(() -> assertEquals(10.0, cuenta.CalcularImporte()));
    }
}
