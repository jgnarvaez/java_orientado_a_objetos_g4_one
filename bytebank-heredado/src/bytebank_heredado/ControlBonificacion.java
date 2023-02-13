package bytebank_heredado;

public class ControlBonificacion {
	
	private double suma;

    public double registrarSalario(Funcionario funcionario) {
        this.suma += funcionario.getBonificacion();
        System.out.println("Calculo actual: " + this.suma);
        return this.suma;
    }
    
    //con ayuda del polimorfismo podemos dejar un solo método para registrar salario
    /*
    public double registrarSalario(Gerente gerente) {
        this.suma += gerente.getBonificacion();
        System.out.println("Calculo actual: " + this.suma);
        return this.suma;
    }
    
    public double registrarSalario(Contador contador) {
        this.suma += contador.getBonificacion();
        System.out.println("Calculo actual: " + this.suma);
        return this.suma;
    }*/

    public double getSuma() {
        return suma;
    }
	
}
