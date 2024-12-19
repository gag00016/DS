package Modelo.Restaurante;

import java.util.Vector;
import Modelo.Cuenta.Cuenta;
import Modelo.Cuenta.Comanda;
import Modelo.Restaurante.Reserva;
import Modelo.Subject;

public class Mesa extends Subject {
	private int _iD;
	private int _numero;
	private int _capacidad;
	private Boolean _ocupada;
	private Mesa _subjectstate;
	public Restaurante _unnamed_Restaurante_;
	public Restaurante _restaurante;
	public Vector<Cuenta> _unnamed_Cuenta_ = new Vector<Cuenta>();
	public Vector<Reserva> _unnamed_Reserva_ = new Vector<Reserva>();
	public Vector<Reserva> _reservas = new Vector<Reserva>();
	public Vector<Cuenta> _cuentas = new Vector<Cuenta>();

	public void GetState() {
		throw new UnsupportedOperationException();
	}

	public void SetState(Object aState) {
		throw new UnsupportedOperationException();
	}

	public void ActualizarEstadoComanda() {
		throw new UnsupportedOperationException();
	}

	public Comanda[] ConsultarComanda() {
		throw new UnsupportedOperationException();
	}

	public Double SolicitarImporteComanda() {
		throw new UnsupportedOperationException();
	}

	public void CrearFactura() {
		throw new UnsupportedOperationException();
	}
}