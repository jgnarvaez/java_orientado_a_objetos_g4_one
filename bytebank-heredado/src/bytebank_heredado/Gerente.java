package bytebank_heredado;

public class Gerente extends Funcionario{
	
	private String clave;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    //sobre-escritura de método
    public double getBonificacion() {
    	System.out.println("EJECUTANDO DESDE GERENTE");
        return super.getBonificacion() + super.getSalario();
    }

    public boolean iniciarSesion(String clave) {
        if(this.clave == clave) {
            return true;
        } else {
            return false;
        }
    }
    
}
