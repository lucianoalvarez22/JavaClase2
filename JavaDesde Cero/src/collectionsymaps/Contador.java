package collectionsymaps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Contador implements Comparable<Contador> {
	
	int valor;
	String modelo;
	
	public Contador(int valor, String modelo) {
		this.valor = valor;
		this.modelo = modelo;
	}
	
	
	
	public int getValor() {
		return valor;
	}



	public String getModelo() {
		return modelo;
	}
	

	@Override
	public String toString() {
		return "Contador [valor=" + valor + ", modelo=" + modelo + "]";
	}


	@Override
	public int compareTo(Contador c) {
		//return this.valor - c.valor;
		return valor - c.valor; 
	}
	
	@Override
	public boolean equals(Object o) {
		Contador conta = (Contador) o;
		if(this==o) return true; 
			else {
				if (this.valor == conta.valor && this.modelo.equals(conta.modelo))
					return true;
				return false; 
			}
	}
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Contador other = (Contador) obj;
//		return Objects.equals(modelo, other.modelo) && valor == other.valor;
//	}

	public static void main(String[] args) {
		Contador c1 = new Contador(10, "Marca1");
		Contador c2 = new Contador(5, "Marca2");
		Contador c3 = new Contador(2, "Marca3");
		Contador c4 = new Contador(5, "Marca4");
		Contador c5 = new Contador(89, "Marca3");
		Contador c6 = new Contador(5, "Marca2");
		Contador c7 = new Contador(5, "Marca5");
		Contador c8 = new Contador(34, "Marca4");
		Contador c9 = new Contador(29, "Marca7");
		Contador c10 = new Contador(10, "Marca1");
		
		ArrayList<Contador> listaContadores = new ArrayList<>();
		listaContadores.add(c1);
		listaContadores.add(c2);
		listaContadores.add(c3);
		listaContadores.add(c4);
		listaContadores.add(c5);
		listaContadores.add(c6);
		listaContadores.add(c7);
		listaContadores.add(c8);
		listaContadores.add(c9);
		listaContadores.add(c10);
		
		Collections.sort(listaContadores);
		
		Set<Contador> setCont = new HashSet<>();
		setCont.add(c1);
		setCont.add(c2);
		setCont.add(c3);
		setCont.add(c4);
		setCont.add(c5);
		setCont.add(c6);
		setCont.add(c7);
		setCont.add(c8);
		setCont.add(c9);
		setCont.add(c10);
		
		for (Contador setActual : setCont) {
			System.out.println(setActual);
		}
		
		System.out.printf("%nLista en HashSet tiene %d contadores.%n", setCont.size());
		
//		for(Contador contadorActual: listaContadores){
//			System.out.println(contadorActual);
//		}
		
		
		
	}



	@Override
	public int hashCode() {
		return Objects.hash(modelo, valor);
	}





	
	

}
