
public class Flujo {
	
	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin main");
	}
	
	private static void metodo1() {
		System.out.println("Inicio metodo1");
		
		try {
			metodo2();
		} catch(MiException me) {
			me.printStackTrace();
		}
		
		System.out.println("Fin de metodo1");
	}
	
	private static void metodo2( ){
		System.out.println("Inicio metodo2");
		
		/*for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			
			try { // Intenta esto
				
				if (i == 3) {
					int num = 0;
					int resultado = i/num;
					System.out.println(resultado);
				}
				
				String test = null;
				System.out.println(test.toString());
				
			} catch (ArithmeticException | NullPointerException exception) { // Atrapa el error
				System.out.println("Atrapo Excepcion");
				System.out.println(exception.getMessage());
				exception.printStackTrace();
			}
			
		}*/
		
		//mi propia excepcion
		
		Cuenta cuenta = new Cuenta();
		//throw cuenta; no se puede
		//throw new ArithmeticException("Surgió un error");
		throw new MiException("Mi excepcion fue lanzada");
		
		//System.out.println("Fin metodo2");
	}
}
