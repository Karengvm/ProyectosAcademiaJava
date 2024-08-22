
public class Shoes extends ProductType {
	
	public Shoes(String Nombre, double BasePrice, double Discount ) {
		super(Nombre, BasePrice, Discount);
	}
	
	@Override
	 public double finalprice() {
		ApplyDiscount();
		System.out.println("SHOES HAVE A 10% EXTRA!!!");
		return BasePrice *0.90;
	}

}