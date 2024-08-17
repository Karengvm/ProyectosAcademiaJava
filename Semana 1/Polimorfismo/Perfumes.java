
public class Perfumes extends ProductType {
	
	public Perfumes(String Nombre, double BasePrice, double Discount ) {
		super(Nombre, BasePrice, Discount);
	}
	
	@Override
	 public double finalprice() {
		ApplyDiscount();
		System.out.println("PERFUMES HAVE A 5% EXTRA!!!");
		return BasePrice * 0.95; //Perfumes tiene otro 5% de descuento especial. 
	}

}