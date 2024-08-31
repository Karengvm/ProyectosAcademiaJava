
public abstract class CoffeeDecorator implements Coffee {
	
	Coffee decoratedCoffee;
	
	public CoffeeDecorator(Coffee coffee) {
		this.decoratedCoffee = coffee;
	}

	@Override
	public String getDescription() {
		 return decoratedCoffee.getDescription();
	}

	@Override
	public double getCost() {
		return decoratedCoffee.getCost();
	}

}
