package misfiguras;

public class Utils {

//	public static Superficiable[] juntaArrays(Superficiable[] sup1, Superficiable[] sup2) {
//		Superficiable[] superArr = new Superficiable[sup1.length + sup2.length];
//		for (int i = 0; i < sup1.length; i++) 
//			superArr[i] = sup1[i]; 
//		for (int j = 0; j < sup2.length; j++)
//			superArr[j + sup1.length] = sup2[j];
//		
//		return superArr;
//		
//		
//	}

	public static Superficiable[] juntaArrays(Superficiable[]... superficiableArray) {
		int contador = 0;
		for(int i=0; i<superficiableArray.length; i++) {
			contador += superficiableArray[i].length;
		
		}
		Superficiable[] superArr = new Superficiable[contador];
		
		int inicializacion = 0;
		
		for(int i=0; i<superficiableArray.length; i++) {
			for(int j=0; j<superficiableArray[i].length; j++) {
				superArr[inicializacion++] = superficiableArray[i][j];
			}
			 
		}

		return superArr;

	}

}
