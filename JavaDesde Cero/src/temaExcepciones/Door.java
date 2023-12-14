package temaExcepciones;

public class Door implements AutoCloseable {

	public void abrePuerta() {
		System.out.println("La puerta se abre");
	}

	@Override
	public void close() {
		System.out.println("La puerta se cierra automaticamente");

	}

	public static void main(String[] args) {
		
		//OPCION TRY RESOURCES
		try(Door d1Try = new Door()){
			d1Try.abrePuerta();
		} catch (Exception e) {
			System.out.println("Ocurrio un error: " + e.getMessage());
		} //HAY UN FINALLY IMPLICITO. NO HACE FALTA LLAMAR A d1Try.close. Se llama automáticamente al finalizar el bloque try

		
		
		//OPCION TRY CATCH FINALLY DE TODA LA VIDA
//		Door d1 = new Door();
//		try {
//			d1.abrePuerta();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			d1.close();
//		}

	}

}
