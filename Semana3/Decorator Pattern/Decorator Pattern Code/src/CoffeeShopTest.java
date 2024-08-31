

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoffeeShopTest {

	private Coffee simpleCoffee;
    private Coffee milkCoffee;
    private Coffee sugarCoffee;
    private Coffee SyrupCoffee;
    private Coffee fullCoffee;
    
    @BeforeEach
    public void setUp() {
        simpleCoffee = new SimpleCoffee();
        milkCoffee = new MilkDecorator(simpleCoffee);
        sugarCoffee = new SugarDecorator(milkCoffee);
        SyrupCoffee = new SyrupDecorator(sugarCoffee);
        fullCoffee = SyrupCoffee;
    }

    @Test
    public void testSimpleCoffee() {
        assertEquals("Simple Coffee", simpleCoffee.getDescription());
        assertEquals(50.00, simpleCoffee.getCost(), 0.01);
    }

    @Test
    public void testMilkDecorator() {
        assertEquals("Simple Coffee, Milk", milkCoffee.getDescription());
        assertEquals(60.00, milkCoffee.getCost(), 0.01);
    }

    @Test
    public void testSugarDecorator() {
        assertEquals("Simple Coffee, Milk, Sugar", sugarCoffee.getDescription());
        assertEquals(62.00, sugarCoffee.getCost(), 0.01);
    }

    @Test
    public void testSyrupDecorator() {
        assertEquals("Simple Coffee, Milk, Sugar, Syrup", SyrupCoffee.getDescription());
        assertEquals(77.00, SyrupCoffee.getCost(), 0.01);
    }

    @Test
    public void testFullCoffee() {
        assertEquals("Simple Coffee, Milk, Sugar, Syrup", fullCoffee.getDescription());
        assertEquals(77.00, fullCoffee.getCost(), 0.01);
    }
    @Test
    public void testMultipleMilkDecorators() {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new MilkDecorator(coffee); // Adding milk twice
        assertEquals("Simple Coffee, Milk, Milk", coffee.getDescription());
        assertEquals(70.00, coffee.getCost(), 0.01);
    }

    @Test
    public void testSugarDecoratorOnSimpleCoffee() {
        Coffee coffee = new SimpleCoffee();
        coffee = new SugarDecorator(coffee);
        assertEquals("Simple Coffee, Sugar", coffee.getDescription());
        assertEquals(52.00, coffee.getCost(), 0.01);
    }

    @Test
    public void testSyrupDecoratorAlone() {
        Coffee coffee = new SimpleCoffee();
        coffee = new SyrupDecorator(coffee);
        assertEquals("Simple Coffee, Syrup", coffee.getDescription());
        assertEquals(65.00, coffee.getCost(), 0.01);
    }

    @Test
    public void testEmptyCoffeeDescription() {
        Coffee coffee = new SimpleCoffee();
        assertNotNull(coffee.getDescription());
        assertFalse(coffee.getDescription().isEmpty());
    }
    
    @Test
    public void testSyrupAndSugarDecoratorWithoutMilk() {
        Coffee coffee = new SimpleCoffee();
        coffee = new SugarDecorator(coffee);  
        coffee = new SyrupDecorator(coffee);  
        assertEquals("Simple Coffee, Sugar, Syrup", coffee.getDescription());
        assertEquals(67.00, coffee.getCost(), 0.01);
    }
    
    @Test
    public void testMultipleSugarDecorators() {
        Coffee coffee = new SimpleCoffee();
        coffee = new SugarDecorator(coffee);  
        coffee = new SugarDecorator(coffee);  
        assertEquals("Simple Coffee, Sugar, Sugar", coffee.getDescription());
        assertEquals(54.00, coffee.getCost(), 0.01);
    }
    
    @Test
    public void testCombined() {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);  
        coffee = new MilkDecorator(coffee);  
        coffee = new SugarDecorator(coffee);     
        coffee = new SyrupDecorator(coffee); 
        assertEquals("Simple Coffee, Milk, Milk, Sugar, Syrup", coffee.getDescription());
        assertEquals(87.00, coffee.getCost(), 0.01);
    }


}