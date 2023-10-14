package poo;

public class Ticket {
	private static int contador = 0;
	private int numero;
	private String fechaCompra;
	private String DNIPersona;
	
	

	public Ticket(String fechaCompra, String DNIPersona) {
		this.numero = contador;
		contador++;
		this.fechaCompra = fechaCompra;
		this.DNIPersona = DNIPersona;
	}
	
	
	@Override 
	public String toString() {
		return "Ticket [numero=" + numero + ", fechaCompra=" + fechaCompra + ", DNIPersona=" + DNIPersona + "]"; 
	}


	public static void main(String[] args) {
		
		Ticket t1 = new Ticket("12-03-2023", "234566X");
		Ticket t2 = new Ticket("15-06-2020", "546745X");
		Ticket t3 = new Ticket("20-02-2005", "756453X");
		Ticket t4 = new Ticket("30-03-2010", "879755X");
		
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);

	}

}
