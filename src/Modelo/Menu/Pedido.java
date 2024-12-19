package Modelo.Menu;

import java.util.Vector;
import Modelo.Menu.Ingrediente;
import Modelo.Subject;

public class Pedido extends Subject {
	private int _iD;
	private String _estado;
	private String _proveedor;
	private Pedido _subjectstate;
	public Ingrediente _unnamed_Ingrediente_;
	public Vector<Ingrediente> _unnamed_Ingrediente_2 = new Vector<Ingrediente>();
	public Vector<Ingrediente> _ingredientes = new Vector<Ingrediente>();

	public void GetState() {
		throw new UnsupportedOperationException();
	}

	public void SetState(Object aState) {
		throw new UnsupportedOperationException();
	}
}