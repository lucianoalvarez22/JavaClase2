package mipaquete;

public class Counter {
	
	//ATRIBUTOS
	private int value = 0;
	private int maxValue = 100_000;
	private static int IDSiguiente;
	private int ID;
	String model = "N-COUNTER";
	
	//CONSTRUCTOR
	public Counter() {	
	}
	
	public Counter(int maxValue) {
		this.maxValue = maxValue;
		if(this.maxValue>0) {
			this.maxValue=maxValue;
		} else {
			this.maxValue=10;
		}
		
		++IDSiguiente;
		ID = IDSiguiente;
	}
	
	public Counter(int maxValue, String model) {
		this.maxValue = maxValue;
		if(this.maxValue>0) {
			this.maxValue=maxValue;
		} else {
			this.maxValue=10;
		}
		this.model = model;
		++IDSiguiente;
		ID = IDSiguiente;
	}
	
	//CONSTRUCTOR COPIA 
	public Counter(Counter anotherCounter) {
		this.maxValue = anotherCounter.maxValue;
		this.value = anotherCounter.value;
		this.model = anotherCounter.model;
	}
	


	public boolean increment() {
		if (maxValue < 100_000) {
			value+=1;
			return true;
		} else {
			return false;
		} 	
	}
	
	boolean increment(int n) {
		if (maxValue < 100_000) {
			value+=n;
			return true;
		} else {
			return false;
		} 	
		
	}
	
	public boolean reset() {
		if(maxValue == 10_000) {
			value = 0;
			return true;
		} else {
			return true;
		}
	}
	
	public void show() {
		System.out.println("Contador: modelo " + model + " y valor " + value + " de " + maxValue + " ID: " + ID );
	}


	public static void main(String[] args) {
		Counter c1 = new Counter(-30, "Counter1");
		Counter c2 = new Counter(-30, "Counter2");
		Counter c3 = new Counter(-30, "Counter3");
		Counter c4 = new Counter(-30, "Counter4");
		Counter c5 = new Counter(-30);
		//System.out.println(c1.increment(20));
		//System.out.println(c1.reset());
		c1.show();
		c2.show();
		c3.show();
		c4.show();
		c5.show();
	}


}
