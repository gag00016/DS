package Modelo.Usuario;

import Modelo.Restaurante.Restaurante;
import Modelo.Subject;

public class Usuario extends Subject {
	private int _iD;
	private String _dNI;
	private String _nombre;
	private String _email;
	private String _direccion;
	private int _nUsuario;
	private String _contrasena;
	private Usuario _subjectstate;
	public Restaurante _unnamed_Restaurante_;
	public Restaurante _unnamed_Restaurante_2;
	public Restaurante _restaurante;
	public Restaurante _unnamed_Restaurante_3;

	public void GetState() {
		throw new UnsupportedOperationException();
	}

	public void SetState(Object aState) {
		throw new UnsupportedOperationException();
	}

	public Boolean ComprobarCredenciales() {
		throw new UnsupportedOperationException();
	}
}