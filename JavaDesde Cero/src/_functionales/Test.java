package _functionales;

public class Test {

	public static void main(String[] args) {
		
		_Predicate<String> p1 = s -> s.contains("d");
		System.out.println(p1.test("Hola"));
	}

}
