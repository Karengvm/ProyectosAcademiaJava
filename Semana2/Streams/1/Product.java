
//Product class where we define the characteristics of the product 
public class Product {
	 	private String name;
	    private String category;
	    private int unitsSold;
	    private double price;

	    public Product(String name, String category, int unitsSold, double price) {
	        this.name = name;
	        this.category = category;
	        this.unitsSold = unitsSold;
	        this.price = price;
	    }

	    // Getters
	    public String getName() { 
	    	return name; }
	    
	    public String getCategory() { 
	    	return category; }
	    
	    public int getUnitsSold() {
	    	return unitsSold; }
	    
	    public double getPrice() { 
	    	return price; }
	    
	    // Setter
	    public void setPrice(double price) {
	    	this.price = price; }
}
