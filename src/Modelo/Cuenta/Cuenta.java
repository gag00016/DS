package Modelo.Cuenta;

import Modelo.Restaurante.Mesa;
import java.util.Vector;

public class Cuenta {
	private int _iD;
	private Double _importe;
	public Mesa _unnamed_Mesa_;
	public Mesa _mesa;
	public Vector<Comanda> _unnamed_Comanda_ = new Vector<Comanda>();
	public Factura _factura;
	public Vector<Comanda> _comandas = new Vector<Comanda>();

	public Vector<Comanda> ConsultarComandas() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Crea una factura asociada a esta cuenta si el importe es mayor a 0.
	 *
	 * @throws RuntimeException si el importe es 0 o negativo.
	 */
	public void CrearFactura() {
		if (_importe > 0) {
			_factura = new Factura(_importe);
		} else {
			throw new RuntimeException("No se puede crear la factura, debido a que su importe es 0");
		}
	}

	public void AnadirDescuento() {
		throw new UnsupportedOperationException();
	}

	public void ModificarFactura() {
		throw new UnsupportedOperationException();
	}

	public void ActualizarEstadoComanda() {
		throw new UnsupportedOperationException();
	}

	public Comanda ConsultarComanda() {
		throw new UnsupportedOperationException();
	}

	public void SolicitarImporteComanda() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Calcula el importe total de la cuenta sumando los importes de todas las comandas asociadas.
	 *
	 * @return el importe total calculado.
	 * @throws RuntimeException si el importe calculado es 0.
	 */
	public Double CalcularImporte() {
		_importe = 0.0;
		for (Comanda comanda : _comandas) {
			_importe += comanda.get_importe();
		}
		if (_importe > 0) {
			return _importe;
		} else {
			throw new RuntimeException("El importe es 0");
		}
	}
}
