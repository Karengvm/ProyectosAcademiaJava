
public class SalesDepartment implements Observer {

    @Override
    public void update(String product, int newStock) {
        System.out.println("Sales notification. Product: " + product + ", New stock: " + newStock);
    }

}
