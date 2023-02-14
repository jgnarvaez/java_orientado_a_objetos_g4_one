package bytebank_heredado;

public class SistemaInterno {
	
	private String clave = "AluraCursosOnLine";
	
	public boolean auntentica(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		}else {
			System.out.println("Error en login");
			return false;
		}
		
	}
	
	/*
	public boolean auntentica(Administrador administrador) {
		boolean puedeIniciarSesion = administrador.iniciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		}else {
			System.out.println("Error en login");
			return false;
		}
		
	}*/
	
}
