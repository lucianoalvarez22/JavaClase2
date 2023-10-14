package poo;

//CLASE COCHE
public class Coche {
	//ATRIBUTOS
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int pesoTotal;
	private boolean asientosCuero, climatizador;
	
	//CONSTRUCTOR
	public Coche () {
		ruedas = 4;
		largo=2000;
		ancho=300;
		peso_plataforma=500;
		
	}
	
	//METODOS - GETTERS PARA OBTENER INFORMACION DE LA PROPIEDAD O ATRIBUTO Y SETTER PARA MODEIFICARLO
	
	public int getRuedas() {
		return this.ruedas;
	}
	
	public String dimeLargo() { //Ponog string porque quiero que me devuelva un texto diciendome el largo
		
		return "El largo del coche es " + largo;
	}
	
	//METODO SETTER
	public void estableceColor(String nuevoColor) {
		color = nuevoColor;
	}
	
	public String dimeColor() {
		return "El color del coche es " + color;
	}
	
	//METODO PARA QUE ME DEVUELVA LOS DATOS GENERALES DEL OBJETO
	
	public String dimeDatosGenerales() {
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas " + 
				". Mide " + largo/1000 + " metros con un ancho de " + ancho + 
				" cm y un peso de plataforma de " + peso_plataforma + " kg"; 
	}
	
	//METODO SETTER PARA MODIFICAR EL ASIENTO DE CUERO
	public void configuraAsientos(String asientosCuero) { 
		
		if (asientosCuero == "si") {
			this.asientosCuero=true;
		} else {
			this.asientosCuero=false;
		}
	}
	
	//GETTERS PARA SABER SI TENEMOS O NO ASIENTOS
	public String dimeAsientos() {
		if(asientosCuero==true) {
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche tiene asientos de serie"; 
		}
	}
	
	
	
	
	
	

}
