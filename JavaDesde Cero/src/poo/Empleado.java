package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona {
	
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
	
	

	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		super(nom);
		this.sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		++IdSiguiente;
		Id = IdSiguiente;
	}

	
	public double dameSueldo() {
		return sueldo;
	}
	
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	
	@Override
	public String dameDescripcion() {
		// TODO Auto-generated method stub
		return "Este empleado tiene un ID= " + Id + " con un sueldo= " + sueldo;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
