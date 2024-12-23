package Modelo.Menu;

import Modelo.Cuenta.Comanda;
import java.util.Vector;

public class ProductoCarta {
	private int _iD;
	private String _nombre;
	private String _categoria;
	private Double _precio;

	public Comanda _unnamed_Comanda_;
	public Carta _unnamed_Carta_;
	public Carta _unnamed_Carta_2;
	public Comanda _unnamed_Comanda_2;
	public Comanda _unnamed_Comanda_3;
	public Vector<Ingrediente> _unnamed_Ingrediente_ = new Vector<Ingrediente>();
	public Ingrediente _unnamed_Ingrediente_2;
	public Vector<Ingrediente> _formado_por = new Vector<Ingrediente>();

	public void set_precio(Double _precio) {
		this._precio = _precio;
	}
}

