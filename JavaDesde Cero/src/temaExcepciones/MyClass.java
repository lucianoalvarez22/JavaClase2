package temaExcepciones;

public class MyClass {

	public static void m1(){
		System.out.println("soy m1");
		try {
			m2();
		} catch (MyCheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Finally");
		}
	}

	public static void m2() throws MyCheckedException {
		System.out.println("soy m2");
//		int i = 7/0;
//		String s = null;
//		s.charAt(1);
		//throw new MyUncheckedException();
		throw new MyCheckedException();

	}
}
