
public class Principal {

    public static void main(String[] args) {
        // Example of creating an order with only main dish and drink
        Order order1 = new OrderBuilder("Steak")
                .withDrink("Red Wine")
                .build();

        // Example of creating a full order
        Order order2 = new OrderBuilder("Pizza")
                .withSideDish("Garlic Bread")
                .withDrink("Coke")
                .withDessert("Ice Cream")
                .build();

        // Example of creating an order with only main dish
        Order order3 = new OrderBuilder("Burger")
                .build();

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
    }
}