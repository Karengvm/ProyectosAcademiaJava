
public class Order {
    private final String mainDish; // required
    private final String sideDish; // optional
    private final String drink;    // optional
    private final String dessert;  // optional

    // Constructor
    Order(OrderBuilder builder) {
        this.mainDish = builder.getMainDish();
        this.sideDish = builder.getSideDish();
        this.drink = builder.getDrink();
        this.dessert = builder.getDessert();
    }

    @Override
    public String toString() {
        return "Order{" +
                "mainDish='" + mainDish + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", drink='" + drink + '\'' +
                ", dessert='" + dessert + '\'' +
                '}';
    }
}