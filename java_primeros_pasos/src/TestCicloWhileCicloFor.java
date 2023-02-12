
public class TestCicloWhileCicloFor {
	
	public static void main(String[] args) {
        int contador = 0;
        while(contador <= 10) {
            System.out.println(contador);
            contador = contador + 1;
        }
        
        for(int contador2 = 0; contador2 <= 10; contador2++) {
            System.out.println(contador2);
        }
        
        //múltiplos de 3
        
        for (int i = 3; i < 100; i += 3 ){
            System.out.println(i);
        }
        
        //factorial de un número
        
        int factorial = 1;
        for (int i = 1; i < 11; i++) {
            factorial *= i;
            System.out.println("Factorial de " + i + " = " + factorial);
        }
    }
	
}
