
public class Clothes extends ProductType {
	
	public Clothes(String Nombre, double BasePrice, double Discount ) {
		super(Nombre, BasePrice, Discount);
	}
	
	@Override
	 public double finalprice() {
		ApplyDiscount();
		System.out.println("No extra discount :(");
		return BasePrice;
	}

}