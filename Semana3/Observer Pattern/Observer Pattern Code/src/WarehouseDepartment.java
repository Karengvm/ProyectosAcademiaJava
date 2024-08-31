
public class WarehouseDepartment implements Observer {

	@Override
	public void update(String product, int newStock) {
        System.out.println("Warehouse Notification. Product: " + product + ", New stock: " + newStock);
    }

}
