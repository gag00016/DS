package Modelo.Menu;

import Modelo.Restaurante.Restaurante;
import java.util.Vector;
import Modelo.Menu.ProductoCarta;
import Modelo.Subject;

public class Carta extends Subject {
	private String _tipoServicio;
	private Carta _subjectstate;
	public Restaurante _tiene;
	public Vector<ProductoCarta> _unnamed_ProductoCarta_ = new Vector<ProductoCarta>();
	public Vector<ProductoCarta> _consta_de = new Vector<ProductoCarta>();

	public void AnadirProductoCarta() {
		throw new UnsupportedOperationException();
	}

	public void ModificarProductoCarta() {
		throw new UnsupportedOperationException();
	}

	public void EliminarProductoCarta() {
		throw new UnsupportedOperationException();
	}

	public ProductoCarta ConsultarProductoCarta() {
		throw new UnsupportedOperationException();
	}

	public void GetState() {
		throw new UnsupportedOperationException();
	}

	public void SetState(Object aState) {
		throw new UnsupportedOperationException();
	}
}