package bytebank_heredado;

public class TestReferencias {

	public static void main(String[] args) {
		
		// Elemento más genérico puede ser adaptado al elemento más específico
		Funcionario funcionario = new Contador();
		funcionario.setNombre("Diego");
		
		//Gerente gerente = new Funcionario(); Error: no compila
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		

	}

}
