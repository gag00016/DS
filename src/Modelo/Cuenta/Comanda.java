package Modelo.Cuenta;

import java.util.Vector;
import Modelo.Menu.ProductoCarta;
import Modelo.Subject;
import Modelo.Observer;

public class Comanda extends Subject {
	private int _iD;
	private Double _importe;
	private String _estado;
	private Comanda _subjectstate;
	public Cuenta _unnamed_Cuenta_;
	public Cuenta _cuenta;
	public Vector<Modelo.Menu.ProductoCarta> _unnamed_ProductoCarta_ = new Vector<ProductoCarta>();
	public Modelo.Menu.ProductoCarta _unnamed_ProductoCarta_2;
	public Vector<Modelo.Menu.ProductoCarta> _anade = new Vector<ProductoCarta>();

	public ProductoCarta ConsultarProductoCarta() {
		throw new UnsupportedOperationException();
	}

	public String ConsultarEstadoComanda() {
		throw new UnsupportedOperationException();
	}

	public void CrearComanda() {
		throw new UnsupportedOperationException();
	}

	public void ActualizarEstado() {
		throw new UnsupportedOperationException();
	}

	public void Attach(Observer aO) {
		throw new UnsupportedOperationException();
	}

	public void Detach(Observer aO) {
		throw new UnsupportedOperationException();
	}

	public void Notify() {
		throw new UnsupportedOperationException();
	}

	public void GetState() {
		throw new UnsupportedOperationException();
	}

	public void SetState(Object aState) {
		throw new UnsupportedOperationException();
	}

	public void ActualizarEstadoComanda() {
		throw new UnsupportedOperationException();
	}

	public Comanda ConsultarComanda() {
		throw new UnsupportedOperationException();
	}

	public Comanda SolicitarComanda() {
		throw new UnsupportedOperationException();
	}

	public Double get_importe() {
		return _importe;
	}
}