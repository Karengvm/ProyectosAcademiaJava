
public class Cuenta {

	//Atributos 
	private int contador;
	private static Cuenta numero; //Atributo estático privado que almacena la instancia de la clase cuenta
	static int repeticiones;
	
	//Constructor privado para implementar el patrón Singleton
	private Cuenta() {
		contador=100;
		repeticiones++;
		
	}
	//Método público getInstance que nos regresa la instancia única de la clase
	public static Cuenta getInstance() { 
		if(numero==null) { //Si la instancia no existe, se crea un nuevo objeto 
			numero = new Cuenta();
		}
		return numero; //Si la instancia ya existe, se devuelve la instancia existente
	}
	
	// Método sincronizado para generar un número de cuenta único
	public synchronized String NumeroCuenta() {
	    contador++; // Incrementa el contador 
	    return "AC" + contador; // Regresa el nuevo número de cuenta
	}

}
