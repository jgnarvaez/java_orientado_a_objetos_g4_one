package bytebank_heredado;

public class Gerente extends Funcionario implements Autenticable{
	
	//sobre-escritura de método
    public double getBonificacion() {
    	System.out.println("EJECUTANDO DESDE GERENTE");
        return 2000;
    }

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}
    
}
