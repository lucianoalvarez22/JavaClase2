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

			if (getPagActual() < getNumPags()) {
				setPagActual(getPagActual() + 1);
				if (getPagActual() == getNumPags()) {
					System.out.println(
							"Última página (" + getNumPags() + ") leída de la revista titulada " + getTitulo());
					setLeido(true);
				} else {

					System.out.println("Página " + getPagActual() + " leída de la revista titulada " + getTitulo());
				}
			} else {
				System.out.println("Revista titulada " + getTitulo() + " ya ha sido leida");
				setLeido(true);
			}
		} else {
			System.out.println("La revista " + getTitulo() + " ya ha sido leida");
		}

	}

}
