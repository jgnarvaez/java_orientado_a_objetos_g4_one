
public class CuentaEjemploPadron {

    public CuentaEjemploPadron(int agencia, int numero){

        if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Número de cuenta inválido");
        }
        
        /*
        IllegalArgumentException e IllegalStateException son dos excepciones
        importantes que el desarrollador de Java debería utilizar. En general,
        cuando tenga sentido, utilice una excepción estándar en lugar de crear
        la suya propia.*/

    }
}