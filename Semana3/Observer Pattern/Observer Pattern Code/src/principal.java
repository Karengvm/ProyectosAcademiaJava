
public class principal {

	public static void main(String[] args) {
		 // Create a product
        Product product = new Product("Laptop", 50);

        // Create observers
        Observer salesDept = new SalesDepartment();
        Observer purchaseDept = new PurchaseDepartment();
        Observer warehouseDept = new WarehouseDepartment();

        // Add observers to the product
        product.addObserver(salesDept);
        product.addObserver(purchaseDept);
        product.addObserver(warehouseDept);

        // Change stock and notify observers
        product.setStock(45); // Decrease stock
        product.setStock(30); // Decrease stock
    
	}

}
