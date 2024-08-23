
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Lambdas {

	public static void main(String[] args) {
		
		//Supplier <T>, Abstract Method .get()
		System.out.println("*Supplier*");
		
		//Supplying a String
		Supplier<String> name = ()->"Karen"; //Parameter null, Return Karen
		String me= name.get(); //
		System.out.println("Example #1:" + me);
		
		//Supplying a random number
		Supplier<Double> randomNum = () -> Math.random();//Parameter null, Return random number between 0 and 1
		System.out.println("Example #2:"+ randomNum.get()); 
		
		//Supplying a linkedlist
		Supplier<List<String>> listSupplier = () -> new LinkedList<>();//Parameter null, Return empty linkedlist
		System.out.println("Example #3:"+ listSupplier.get());
		
		//Supplying a Number
		Supplier<Integer> number = () -> 24; //Parameter null, Return 24
		System.out.println("Example #4:"+ number.get());  

		//Consumer <T>, Abstract Method .accept(T)
		System.out.println("*Consumer*");
		
		//Printing a String
		Consumer<String> code = (str) -> System.out.println(str); // Parameter String, Return void
		code.accept("Hello, World!");  // since consumer doesn't return a result, .accept is use for printing
		
		//Appending a String to a StringBuilder
		Consumer<StringBuilder> appendLN = fn -> fn.append(" Valdez");// Parameter StringBuilder, Return void
		StringBuilder fn = new StringBuilder("Karen");
		appendLN.accept(fn); // it appends " Valdez" to the existing StringBuilder "Karen".
		System.out.println(fn); 
		
		//Using it in Arrays
		List<String> list = Arrays.asList("Laura", "Juan", "Carlos");
		Consumer<String> greet = names -> System.out.println("Name: " + names);// Parameter String, Return void
		list.forEach(greet);  //forEach() internally calls greet.accept(name) for each element in the names list.

		//Incrementing an Integer
		Consumer<Integer> increment = i -> System.out.println(i + 1);// Parameter integer, Return void
		increment.accept(12);  
		
		//BiConsumer<T,U> Abstract Method .accept(T,U)
		System.out.println("*BiConsumer*");
		
		//Printing two String and Integer
		BiConsumer<String, Integer> printPair = (Person, age) -> { // Parameter <String, integer>, Return void
			System.out.println("Name: " + Person + ", Age: " + age); //Printing name and age
		}; 
        printPair.accept("Carlos", 28);

        // Adding Values to a Map
        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> addToMap = (key, value) -> { // Parameter <String, integer>, Return void
        	map.put(key, value); //Adding key and value to map
        };
        addToMap.accept("David", 40);
        addToMap.accept("Lopez", 35);
        System.out.println(map); //Printing map 

        //Operations 
        BiConsumer<Integer, Integer> multiplyAndPrint = (a, b) -> { // Parameter <integer, integer>, Return void
            int result = a * b;
            System.out.println("Result of " + a + " * " + b + " = " + result);
        };
        multiplyAndPrint.accept(5, 10); //Returns the result 
        
        //Concatenating Two Strings
        BiConsumer<String, String> concatenate = (str1, str2) -> {// Parameter <String, String>, Return void
            String result = str1 + str2;
            System.out.println(result);
        };
        concatenate.accept("Carlos", " Rodriguez");//Returns the two strings concatenated
        
        //Predicate<T>, Abstract Method test(T)
        System.out.println("*Predicate*");
        
        //Checking if string is empty 
        Predicate<String> isEmpty = str -> str.isEmpty(); // Parameter <String>, Return boolean
        System.out.println(isEmpty.test("")); // printing true or false
        
        //Checking if they have 21 or more
        Predicate<Integer> isAdult = age -> age >= 21; // Parameter <Integer>, Return boolean
        System.out.println(isAdult.test(20)); // printing true or false
        
        //Filtering a list of salaries
        List<Integer> integers = List.of(1000,500,2500,1500); //Create list with integers
        Predicate<Integer> morethan1000 = salary -> salary > 1000; // Parameter <Integer>, Return boolean
        List<Integer> HighSalary = integers.stream() //Create a stream from the list
                                          .filter(morethan1000) // internally calls test(T) for each element in the stream
                                          .collect(Collectors.toList()); // gathers the filtered elements into a new list.
        System.out.println(HighSalary);
        
        //Checking if a number is even 
        Predicate<Integer> isEven = num -> num % 2 == 0; // Parameter <Integer>, Return boolean
        System.out.println(isEven.test(4));  // true
        
        //BiPredicate<T,U>, Abstract Method test(T,U)
        System.out.println("*BiPredicate*");
        
        //Comparing Two Integers to See if the First is Greater than the Second
        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b; // Parameter <Integer, Integer>, Return boolean
        System.out.println(isGreater.test(3, 7));  // false
        
        //Verifying if One String Contains Another String
        BiPredicate<String, String> containsSubstring = (s, d) -> s.contains(d);
        System.out.println(containsSubstring.test("hello world", "world")); // true
        
        //Checking if Two Numbers Are Equal
        BiPredicate<Integer, Integer> areEqual = (num1, num2) -> num1.equals(num2);// Parameter <Integer, Integer>, Return boolean
        System.out.println(areEqual.test(5, 52)); // false
        
        //Checking if Two Strings Have the Same Length
        BiPredicate<String, String> haveSameLength = (str1, str2) -> str1.length() == str2.length(); // Parameter <String, String>, Return boolean
        System.out.println(haveSameLength.test("apple", "peach"));  // true
        
        //Function<T,R>, Abstract Method apply(T)
        System.out.println("*Function*");
        
        //Converting a String to Its Length
        Function<String, Integer> stringLength = c -> c.length();// Parameter <String, Integer>, Return integer
        System.out.println(stringLength.apply("Monterrey")); 
        
        //Applying a Discount to a Price
        Function<Double, Double> applyDiscount = price -> price * 0.9; // Parameter <Double, Double>, Return double
        System.out.println(applyDiscount.apply(100.0));  //Apply 10% discount 
        
        //Concatenate two strings 
        Function<String, String> phrase = c -> c + " Soria";// Parameter <String, String>, Return String
        System.out.println(phrase.apply("Bryan")); 

        //Converting an Integer to Its String Representation
        Function<Integer, String> intToString = num1 -> num1.toString(); // Parameter <Integer, String>, Return String
        System.out.println(intToString.apply(123));  

        //Function<T,U,R>, Abstract Method apply(T,U)
        System.out.println("*BiFunction*");
        
        //Concatenating Two Strings
        BiFunction<String, String, String> con1= (nombre, nombre2) -> nombre + nombre2;// Parameter <String, String, String>, Return String
        System.out.println(con1.apply("Hello ", "World!")); 
        
        //Power of a number
        BiFunction<Double, Integer, Double> power = (base, exponent) -> Math.pow(base, exponent); // Parameter <Double, String, Double>, Return Double
        System.out.println(power.apply(2.0, 3));
        
        // Adding Two Integers
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b; // Parameter <Integer, Integer, Integer>, Return Integer
        System.out.println(add.apply(5, 10)); 
        
        //Calculating the Average of Two Integers
        BiFunction<Integer, Integer, Double> average = (a, b) -> (a + b) / 2.0; // Parameter <Integer, Integer, Double>, Return Double
        Double result1 = average.apply(10, 20);
        System.out.println(result1);  
        
        //UnaryOperator<T>, Abstract Method apply(T)
        System.out.println("*UnaryOperator*");
        
        //Concatenating Two Strings
        UnaryOperator<String> rol1=  z -> z + "Salazar";// Parameter <String>, Return String
        System.out.println(rol1.apply( "Moises ")); 
        
        //Incrementing an Integer
        UnaryOperator<Integer> in = x -> x + 1; // Parameter <Integer>, Return Integer
        System.out.println(in.apply(5)); 
        
        //Converting a String to Uppercase
        UnaryOperator<String> toUpperCase = str -> str.toUpperCase(); // Parameter <String>, Return String
        System.out.println(toUpperCase.apply("hello"));  
        
        //Operation with integers 
        UnaryOperator<Integer> sub = x -> x - 5; // Parameter <Integer>, Return Integer
        System.out.println(sub.apply(5)); 
        
        //BinaryOperator<T>, Abstract Method apply(T,T)
        System.out.println("*BinaryOperator*");
        
        //Trimming and Concatenating Two Strings
        BinaryOperator<String> trimAndConcat = (s1, s2) ->  s1.trim() + " " + s2.trim(); // Parameter <String, String>, Return String
        String result = trimAndConcat.apply("  Hello  ", "  World  ");
        System.out.println(result); 
        
        //Finding the Maximum of Two Numbers
        BinaryOperator<Integer> max = (a, b) -> a > b ? a : b; // Parameter <Integer, Integer>, Return Integer
        System.out.println(max.apply(5, 10)); 
        
        //Multiplying Two Doubles
        BinaryOperator<Double> multiply = (a, b) -> a * b; //Parameter <Double, Double>, Return Double
        System.out.println(multiply.apply(100.5, 100.5)); 
        
        //Adding Two Integers
        BinaryOperator<Integer> add2 = (a, b) -> a + b;//Parameter <Integer, Integer>, Return Integer
        System.out.println(add2.apply(5, 10));  

    }

}
