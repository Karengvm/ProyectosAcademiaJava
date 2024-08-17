
//Singleton 
//Generador de números de cuenta únicos
public class Main {

	public static void main(String[] args) {
		

        // Generar la instancia única
        Cuenta generar= Cuenta.getInstance();
        
        //Generar los números de cuenta únicos 
        String numeroCuenta1 = generar.NumeroCuenta();
        String numeroCuenta2 = generar.NumeroCuenta();
        String numeroCuenta3 = generar.NumeroCuenta();

        // Imprimir los números de cuenta generados
       
        System.out.println("Número de cuenta 1: " + numeroCuenta1);
        System.out.println("Número de cuenta 2: " + numeroCuenta2);
        System.out.println("Número de cuenta 3: " + numeroCuenta3);

        System.out.println(Cuenta.repeticiones);
        // Imprimir el número de veces que se ha instanciado la clase Cuenta
        // Dado que es un Singleton, este valor debería ser 1, indicando que solo se creó una instancia

	}

}
