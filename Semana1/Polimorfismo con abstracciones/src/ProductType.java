
public abstract class ProductType implements Product{
	
	//Atributos 
	String Nombre;
	double BasePrice;
	double Discount;
	
	//Constructor
	public ProductType(String Nombre, double BasePrice, double Discount) {
		this.Nombre= Nombre;
		this.BasePrice=BasePrice;
		this.Discount= Discount;
	}
	
	//Método
	public void ApplyDiscount() {
		BasePrice= BasePrice-(BasePrice*(Discount/100));
		
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+ " "+ "-"+
				Nombre + " $" + BasePrice + " with " + Discount +" % " + "off";
	}
}
