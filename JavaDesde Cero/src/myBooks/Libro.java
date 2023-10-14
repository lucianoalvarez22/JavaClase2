package myBooks;

public class Libro extends Publicacion {

	private String autor;
	private static String mensajeCabecera = "\nDATOS LIBRO\n===========\n";

	public Libro(String titulo, String autor, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		super(titulo, numPags, pagInicial, formatoDigital, precio);
		this.autor = autor;
	}

	public static String getMensajeCabecera() {
		return mensajeCabecera;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public String show() {
		return this.mensajeCabecera + "Titulo: " + getTitulo() + "\n" + "Autor: " + this.autor + "\n" + "Id: " + getID()
				+ "\n" + "Páginas: " + getNumPags() + "\n" + "Página inicial: " + getPagInicial() + "\n"
				+ "Página Actual: " + getPagActual() + "\n" + "Precio: " + getPrecio() + "\n" + "Formato digital: "
				+ isFormatoDigital() + "\n" + "Leido: " + isLeido();
	}

	@Override
	public void leePagina(boolean silenciosamente) {
		if (!this.isLeido()) {
			if (silenciosamente) {
				if (getPagActual() < 304) {
					setPagActual(getPagActual() + 1);
				} else {
					System.out.println("Estas en la pagina 304");
				} 
			} else {
				if (getPagActual() < 309) {
					setPagActual(getPagActual() + 1);
					if (getPagActual() == getNumPags()) {
						System.out.println("Última página (" + getNumPags() + ") leída del libro titulado "
								+ getTitulo() + " del autor " + getAutor());
						setLeido(true);
					} else {

						System.out.println("Página " + getPagActual() + " leída del libro titulado " + getTitulo()
								+ " del autor " + getAutor());
					}
				} else if (getPagActual() == 309) {
					System.out.println("Estás en la pagina: 309");
					setPagActual(getPagActual() + 1);
					if (getPagActual() == getNumPags()) {
						System.out.println("El libro " + getTitulo() + " ha sido leído");
						setLeido(true);
					}
				} else if (getPagActual() == 310) {
					System.out.println("Estas en la pagina 310");
					setPagActual(getPagActual() + 1);
					if (getPagActual() == getNumPags()) {
						System.out.println("El libro " + getTitulo() + " ha sido leído");
						setLeido(true);
					}
				} else {
					if (getPagActual() == getNumPags()) {
						System.out.println("Última página (" + getNumPags() + ") leída del libro titulado "
								+ getTitulo() + " del autor " + getAutor());
						setLeido(true);
					} else {

						System.out.println("Página " + getPagActual() + " leída del libro titulado " + getTitulo()
								+ " del autor " + getAutor());
					}
					
					setPagActual(getPagActual() + 1);
				}
			}

		} 
//		else {
//			System.out.println("El libro " + getTitulo() + " del autor " + getAutor() + " ya ha sido leido");
//		}

	}

}
