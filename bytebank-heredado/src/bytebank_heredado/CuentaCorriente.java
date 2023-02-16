package bytebank_heredado;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	/*
	//metodo sobre-escrito de la clase padre
	@Override
	public boolean saca(double valor) {
		double comision = 0.2;
		return super.saca(valor + comision);
	}*/
	
	//con excepción (refactor)
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double comision = 0.2;
		super.saca(valor + comision);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
}
