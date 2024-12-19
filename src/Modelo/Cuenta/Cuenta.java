package Modelo.Cuenta;

import Modelo.Restaurante.Mesa;
import java.util.Vector;
import Modelo.Cuenta.Comanda;

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

	public void CrearFactura() {
		_factura = new Factura();
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

	public Double CalcularImporte() {
		_importe = 0.0;
		for (Comanda comanda : _comandas) {
			_importe += comanda.get_importe();
		}
		if (_importe > 0) return _importe;
		throw new RuntimeException("El importe es 0");
	}
}