package bytebank;

public class TestMetodos {

	public static void main(String[] args) {
		
		Cuenta cuentaDeDiego = new Cuenta(1,2);
		// cuentaDeDiego.saldo = 100;
        cuentaDeDiego.deposita(100);
        cuentaDeDiego.deposita(50);
        System.out.println(cuentaDeDiego.getSaldo());

        boolean consigioRetirar = cuentaDeDiego.saca(20);
        System.out.println(cuentaDeDiego.getSaldo());
        System.out.println(consigioRetirar);

        Cuenta cuentaDeJimena = new Cuenta(1,3);
        cuentaDeJimena.deposita(1000);

        boolean exitoTransferencia = cuentaDeJimena.transfiere(300, cuentaDeDiego);
        if(exitoTransferencia) {
            System.out.println("transferencia exitosa");
        } else {
            System.out.println("falto dinero");
        }

	}

}
