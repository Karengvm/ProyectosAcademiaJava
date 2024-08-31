
public class PurchaseDepartment implements Observer {

	@Override
    public void update(String product, int newStock) {
        System.out.println("Purchases notification. Product: " + product + ", New stock: " + newStock);
    }

}
