
public class ConceptosFundamentales {
	
	public static void main (String[] args) {
		System.out.println("Hola Mundo");
		
		//variables
		
		//integer
		int edadPrueba = 37;
		System.out.println("La edad es "+ edadPrueba + ", Felicitaciones!");
        
        int division = 5/2;
        System.out.println (division);
        
        //decimal
        double division2 = 5.0 / 2;
        System.out.println (division2);
        
        //decimal
        float puntoFlotante = 3.14f;
        System.out.println(puntoFlotante);

        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;
        System.out.println(total);
        
        //un solo caracter
        char letra = 'a';
        System.out.println(letra);

        valor = (char) (valor + 1);
        System.out.println(valor);
        
        //cadena
        String palabra = "Alura cursos online de tecnología";
        System.out.println(palabra);

        palabra = palabra + 2020;
        System.out.println(palabra);
        
        //condicional
        
        System.out.println("probando condicionales");

        int edad = 20;
        int cantidadPersonas = 3;

        if (edad >= 18) {
            System.out.println("Tienes más de 18 años");
            System.out.println("Bienvenido ");
        } else {
            if (cantidadPersonas >= 2) {
                System.out.println("No tienes 18 años, pero puedes ingresar, porque estás acompañado");
            } else {
                System.out.println("Lamentablemente no puedes ingresar");
            }
        }
        
        //boolean
        
        System.out.println("probando condicionales ");

        int edadBoolean = 16;
        int cantidadPersonasBoolean = 3;
        boolean acompañado = cantidadPersonasBoolean >= 2;

        if (edadBoolean >=18 && acompañado) {
            System.out.println("Bienvenido"); 
        } else {
            System.out.println("Lamentablemente no puedes ingresar");
        }
        
        
	}
	
}
