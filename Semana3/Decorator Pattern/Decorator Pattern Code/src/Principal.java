
public class Principal {

	public static void main(String[] args) {
		 Coffee simpleCoffee = new SimpleCoffee();
	        System.out.println(simpleCoffee.getDescription() + " $" + simpleCoffee.getCost());

	        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
	        System.out.println(milkCoffee.getDescription() + " $" + milkCoffee.getCost());

	        Coffee milkAndSugarCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
	        System.out.println(milkAndSugarCoffee.getDescription() + " $" + milkAndSugarCoffee.getCost());

	        Coffee fullyDecoratedCoffee = new SyrupDecorator(new SugarDecorator(new MilkDecorator(new SimpleCoffee())));
	        System.out.println(fullyDecoratedCoffee.getDescription() + " $" + fullyDecoratedCoffee.getCost());
	} 
}
