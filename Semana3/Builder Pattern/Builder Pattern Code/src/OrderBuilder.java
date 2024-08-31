
public class OrderBuilder {
    private final String mainDish; // required
    private String sideDish;       // optional
    private String drink;          // optional
    private String dessert;        // optional

    public OrderBuilder(String mainDish) {
        this.mainDish = mainDish;
    }
    
    //Setter
    public OrderBuilder withSideDish(String sideDish) {
        this.sideDish = sideDish;
        return this;
    }

    public OrderBuilder withDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public OrderBuilder withDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public Order build() {
        return new Order(this);
    }

    // Getters
    public String getMainDish() {
        return mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public String getDrink() {
        return drink;
    }

    public String getDessert() {
        return dessert;
    }
}