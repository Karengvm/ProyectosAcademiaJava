
public class Makeup extends ProductType {
	
	public Makeup(String Nombre, double BasePrice, double Discount ) {
		super(Nombre, BasePrice, Discount);
	}
	
	@Override
	 public double finalprice() {
		ApplyDiscount();
		System.out.println("MAKEUP HAS A 10% EXTRA!!!");
		return BasePrice * 0.90; //Makeup tiene otro 10% de descuento especial. 
	}
	
	
}