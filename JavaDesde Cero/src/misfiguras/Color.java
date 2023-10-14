package misfiguras;

public class Color {
	
	static String[] colores = {"Negro", "Azul", "Marrón", "Gris", "Verde", "Naranja", "Rosa", "Púrpura", "Rojo", "Blanco" , "Amarillo"};
	
	

	public static String devuelveColor(String colorIntroducido) {
		
		String colorCambiantes = "Negro";
		
		for(String elem : colores) {
			if(colorIntroducido.equalsIgnoreCase(elem))
				colorCambiantes=elem;	
		}
		
		return colorCambiantes;
		
	}
	
	public static void devolverLista() {
		for(String elem : colores) {
			System.out.println(elem);
		} 
	}
	
	
	
	public static void main(String[] args) {
		Color col1 = new Color();
		System.out.println(col1.devuelveColor("sdjnvfkvkv"));
		col1.devolverLista();
	}
}

