package myBooks;

public class Revista extends Publicacion {

	private static String mensajeCabecera = "\nDATOS REVISTA\n===========\n";

	public Revista(String titulo, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		super(titulo, numPags, pagInicial, formatoDigital, precio);
	}

	public static String getMensajeCabecera() {
		return mensajeCabecera;
	}

	@Override
	public String show() {
		return this.mensajeCabecera + "Titulo: " + getTitulo() + "\n" + "Id: " + getID() + "\n" + "Páginas: "
				+ getNumPags() + "\n" + "Página inicial: " + getPagInicial() + "\n" + "Página Actual: " + getPagActual()
				+ "\n" + "Precio: " + getPrecio() + "\n" + "Formato digital: " + isFormatoDigital() + "\n" + "Leido: "
				+ isLeido();
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
								+ getTitulo());
						setLeido(true);
					} else {

						System.out.println("Página " + getPagActual() + " leída del libro titulado " + getTitulo());
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
								+ getTitulo());
						setLeido(true);
					} else {

						System.out.println("Página " + getPagActual() + " leída del libro titulado " + getTitulo());
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
