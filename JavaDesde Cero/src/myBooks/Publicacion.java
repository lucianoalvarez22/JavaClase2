package myBooks;

import java.util.ArrayList;

public abstract class Publicacion implements CanRead {

	private String titulo;
	private int numPags; // Numero Total de Páginas
	private int pagInicial; // los libros empiezan a leerse en una página que puede ser la 1, la 2, u otra.
	private boolean formatoDigital;
	private double precio;
	private int ID;
	private int pagActual;
	private boolean leido;

	// Propiedades estáticas
	private static long nextID;

	// Constructor
	public Publicacion(String titulo, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		this.titulo = titulo;
		this.numPags = numPags;
		this.pagInicial = pagInicial;
		this.formatoDigital = formatoDigital;
		this.precio = precio;
		++nextID;
		ID = (int) nextID - 1;
		this.pagActual = pagInicial;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "Publicacion " + this.titulo + " con " + this.numPags + " paginas y precio " + this.precio + " €"
				+ " Y con ID " + this.ID;
	}

	// GET AND SET

	public String getTitulo() {
		return this.titulo;
	}

	public int getID() {
		return this.ID;
	}

	public int getPagInicial() {
		return this.pagInicial;
	}

	public void setPagActual(int pagActual) {
		this.pagActual = pagActual;
	}

	public int getPagActual() {
		return this.pagActual;
	}

	public int getNumPags() {
		return this.numPags;
	}

	public boolean isFormatoDigital() {
		return this.formatoDigital;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setLeido(boolean leido) {
		this.leido = leido;
	}

	public boolean isLeido() {
		return this.leido;
	}

	// Metodo de instancia SHOW()
	public abstract String show();

	// METODO SHOW STATIC
	public static void showStatic(Publicacion p) {
		System.out.println(p.show());
	}

	// METODO LEEPAGINA STATIC
	public abstract void leePagina(boolean silenciosamente);
	
	public static void leePaginaStatic(boolean silenciosamente, Publicacion p) {
		p.leePagina(silenciosamente);
	} 

}
