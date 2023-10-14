import javax.swing.JOptionPane;
public class Bucle_For {

	public static void main(String[] args) {
		
		//BUCLE FOR SE DIVIDE EN 3 PARTES: INICIO DEL BUCLE - CONDICION - CONTADOR BUCLE(Incremento o decremento)
		
		int arroba = 0;
		boolean punto = false;
		
		String mail = JOptionPane.showInputDialog("Introduce mail: ");
		
		for(int i=0; i<mail.length(); i++) {
			
			if (mail.charAt(i) =='@') {
				arroba++;
			}
			
			else if(mail.charAt(i)=='.') {
				punto=true;
			}
			
		}
		
		if (arroba==1 && punto==true) {
			System.out.println("El mail es correcto");
		}
		
		else {
			System.out.println("El mail no es correcto");
		}

	}

}
