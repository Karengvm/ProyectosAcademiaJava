
public class Books extends ProductType {
	
	public Books(String Nombre, double BasePrice, double Discount ) {
		super(Nombre, BasePrice, Discount);
	}
	
	@Override
	 public double finalprice() {
		ApplyDiscount();
		System.out.println("BOOKS HAVE A 15% EXTRA!!!");
		return BasePrice * 0.85;
	}

}
