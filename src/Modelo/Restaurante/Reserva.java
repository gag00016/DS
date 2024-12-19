package Modelo.Restaurante;

import Modelo.Subject;

public class Reserva extends Subject {
	private int _iD;
	private Object _fecha;
	private Object _hora;
	private Object _subjectstate;
	public Mesa _unnamed_Mesa_;
	public Mesa _mesa;

	public void GetState() {
		throw new UnsupportedOperationException();
	}

	public void SetState(Object aState) {
		throw new UnsupportedOperationException();
	}
}