package temaExcepciones;

public class EstanteConPuerta {

	private int numberOfSlots;
	private String[] slots;
	private boolean doorOpen;
	private boolean doorBroken;

	public EstanteConPuerta(int n) throws BadNumberOfSlotsException {
		if (n < 1 || n > 10) {
			throw new BadNumberOfSlotsException("BadNumberOfSlotsException");
		} else {
			numberOfSlots = n;
			slots = new String[numberOfSlots];
		}
	}

	public void breakDoor() {
		this.doorBroken = true;
	}

	public void openDoor() throws EstanteConPuertaOutOfOrderException {
		if (doorOpen == false && doorBroken == false) {
			doorOpen = true; 
		} else if (doorBroken) {
			throw new EstanteConPuertaOutOfOrderException("EstanteConPuertaOutOfOrderException");	
		}
	}

	public void closeDoor() throws EstanteConPuertaOutOfOrderException {
		if (doorOpen == true && doorBroken == false) {
			doorOpen = false;
		} else if (doorBroken) {
			throw new EstanteConPuertaOutOfOrderException("EstanteConPuertaOutOfOrderException");	
		}
	}

	public void addString(String s) throws EstanteConPuertaOutOfOrderException, NoMoreSpaceException {
		openDoor();
		
		for (int i = 0; i < slots.length; i++) {
			if (slots[i] == null) {
				slots[i] = s;
				break;
			} 
			
			if(i==slots.length-1) {
				throw new NoMoreSpaceException("NoMoreSpaceException");	
			}

		}
		System.out.println(s);
		
		closeDoor();
	}

	public static void main(String[] args) {

//		try {
//			EstanteConPuerta e1 = new EstanteConPuerta(25);
//		} catch (BadNumberOfSlotsException e) {
//			e.printStackTrace();
//		}

		
//		try {
//			EstanteConPuerta e2 = new EstanteConPuerta(5);
//			e2.addString("Palabra1");
//			e2.addString("Palabra2");
//			e2.addString("Palabra3");
//			e2.addString("Palabra4");
//			e2.addString("Palabra5");
//			e2.addString("Palabra6");
//		} catch (BadNumberOfSlotsException e) {
//			e.printStackTrace();
//		} catch (EstanteConPuertaOutOfOrderException e) {
//			e.printStackTrace();
//		} catch (NoMoreSpaceException e) {
//			e.printStackTrace();
//		}

		try {
			EstanteConPuerta e4 = new EstanteConPuerta(4);
			e4.addString("E4Palabra");
			e4.breakDoor();
			e4.addString("E4Palabra2");
		} catch (BadNumberOfSlotsException e) {
			e.printStackTrace();
		} catch (EstanteConPuertaOutOfOrderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoMoreSpaceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
