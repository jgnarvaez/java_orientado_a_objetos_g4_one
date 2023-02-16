package bytebank_heredado;

public class TestCuentaExceptionSaldo {

	public static void main(String[] args) {
		
		Cuenta cuenta = new CuentaAhorros(123, 456);
		cuenta.deposita(210);
		try {
			cuenta.saca(200);
			cuenta.saca(100);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
	}

}
