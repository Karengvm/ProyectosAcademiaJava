
//Sales and Products Analysis 
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		//The list of products is created 
		 List<Product> products = Arrays.asList(
		            new Product("Laptop", "Electronics", 150, 1000.0),
		            new Product("Smartphone", "Electronics", 300, 700.0),
		            new Product("Chair", "Furniture", 500, 150.0),
		            new Product("Desk", "Furniture", 30, 250.0),
		            new Product("Headphones", "Electronics", 200, 50.0),
		            new Product("Cabinet", "Furniture", 100, 300.0)
		        );
		 
		// Process the products to identify the Best Sellers in Each Category
		// 1. Filter products with more than 100 units sold
		// 2. Peek increase the price 10%
		// 3. Sort products by category
		// 4. FlatMap to convert product names into a stream
		// 5. Terminal operation: Collecting product names by category
		 
		// Converting the list of products into a Stream and processing it to identify top-performing products by category
		 Map<String, List<String>> topCategoryProducts = products.stream()
				.filter(product -> product.getUnitsSold() > 100) //1
				.peek(product -> System.out.println("Filtered product: " + product.getName())) //2
	            .sorted((p1, p2) -> p1.getCategory().compareTo(p2.getCategory())) //3
	            .flatMap(product -> Collections.singletonList(product.getName()).stream()) //4
	            .collect(Collectors.groupingBy( //5
	                productName -> products.stream()
	                    .filter(p -> p.getName().equals(productName))
	                    .findFirst()
	                    .map(p -> p.getCategory())
	                    .orElse("Unknown"))) 
	            ;
         
		   // Output the results
			 topCategoryProducts.forEach((category, productNames) -> 
	         System.out.println("Category: " + category + ", Top Products: " + productNames));
	}

}
