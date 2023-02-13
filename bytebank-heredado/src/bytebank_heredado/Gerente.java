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
    @Override
    public double getBonificacion() {
    	System.out.println("EJECUTANDO DESDE GERENTE");
        return super.getSalario() + super.getSalario() * 0.05;
    }

    public boolean iniciarSesion(String clave) {
        if(this.clave == clave) {
            return true;
        } else {
            return false;
        }
    }
    
}
