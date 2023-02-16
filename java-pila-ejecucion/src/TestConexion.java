
public class TestConexion {

	public static void main(String[] args) throws Exception {
		
		/*
		Conexion con = new Conexion();
		try {
			con.leerDatos();
		} catch (IllegalStateException ex) {
			System.out.println("Recibiendo exception");
			ex.printStackTrace();
		} finally {
			System.out.println("Ejecutando finally");
			con.cerrar();
		}*/
		
		/*
		Conexion con = null;
		try {
			con = new Conexion();
			con.leerDatos();
		}
		catch (IllegalStateException ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println("Ejecutando finally");
			if (con != null) {
				con.cerrar();
			}
		}*/
		
		//otro tipo de try (try con recursos)
		try (Conexion con = new Conexion()) {
			con.leerDatos();
		} catch (IllegalStateException ex) {
			System.out.println("Ejecutando catch");
			ex.printStackTrace();
		}
		
	}

}
