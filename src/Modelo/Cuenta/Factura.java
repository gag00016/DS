package Modelo.Cuenta;

import java.util.Date;

public class Factura {
	private int _iD;
	private int _codigo;
	private Date _fecha;
	public Double _importe;
	private String _metodoPago;
	public Cuenta _genera;

	public Factura(Double _importe) {
		this._importe = _importe;
	}

	public void CrearFactura() {
		throw new UnsupportedOperationException();
	}

	public void AnadirDescuento() {
		throw new UnsupportedOperationException();
	}

	public void ModificarFactura() {
		throw new UnsupportedOperationException();
	}

	public void CerrarFactura() {
		throw new UnsupportedOperationException();
	}
}