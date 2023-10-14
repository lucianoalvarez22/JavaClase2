package misfiguras;

public class Piso implements Superficiable {
	
	private int superficieM2;
	
	

	public Piso(int superficieM2) {
		this.superficieM2 = superficieM2;
	}



	@Override
	public double superficie() {
		return superficieM2; 
	}



	@Override
	public String toString() {
		return "Piso: superficieM2 = " + superficieM2;
	}
	
	
	

}
