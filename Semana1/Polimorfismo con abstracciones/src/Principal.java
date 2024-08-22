//Polimorfismo utilizando una clase abstracta y una interfaz
//Calculo del precio final de diferentes productos de una tienda 

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Product> productos=
				new ArrayList<>();
		
		productos.add(new Makeup ("Rimmel", 200, 15) );
		productos.add(new Books ("It End With Us", 300, 10));
		productos.add(new Clothes ("Short", 500, 20));
		productos.add(new Shoes ("Converse", 1200, 35));
		productos.add(new Perfumes("My Way", 2500, 30));

	
		for (Product pro: productos) {
			System.out.println(pro);
			System.out.println("Final Price: $" + pro.finalprice());
		}
	}

}

//Se usa el polimorfismo en este código porque cada tipo de producto (Makeup, Books, Clothes, Shoes, Perfumes)
// tiene una implementación específica del método finalprice() que se ajusta a sus propias reglas para calcular el precio final.
// Todos los productos se almacenan en una lista de tipo Product, el método finalprice() se invoca dinámicamente para
// cada tipo de producto en función de su implementación real, no de la interfaz Product.
// Todos los productos se heredan de la clase abstracta ProductType, que a su vez implementa la interfaz Product.
