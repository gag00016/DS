package Modelo.Restaurante;

import java.util.Vector;
import Modelo.Usuario.Usuario;
import Modelo.Restaurante.Mesa;
import Modelo.Menu.Carta;
import Modelo.Subject;

public class Restaurante extends Subject {
	private int _iD;
	private static Restaurante _instancia_unica;
	private String _nombre;
	private String _direccion;
	private Restaurante _subjectstate;
	public Vector<Usuario> _unnamed_Usuario_ = new Vector<Usuario>();
	public Vector<Mesa> _unnamed_Mesa_ = new Vector<Mesa>();
	public Usuario _unnamed_Usuario_2;
	public Usuario _unnamed_Usuario_3;
	public Vector<Mesa> _dispone_de = new Vector<Mesa>();
	public Vector<Usuario> _usuarios = new Vector<Usuario>();
	public Carta _tiene;

	public void GetState() {
		throw new UnsupportedOperationException();
	}

	public void SetState(Object aState) {
		throw new UnsupportedOperationException();
	}

	public Boolean IniciarSesion() {
		throw new UnsupportedOperationException();
	}

	public void ActualizarEstadoComanda() {
		throw new UnsupportedOperationException();
	}

	public void CerrarSesion() {
		throw new UnsupportedOperationException();
	}

	public String ConsultarEstadoComanda() {
		throw new UnsupportedOperationException();
	}
}