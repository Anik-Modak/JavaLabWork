package main;

public class NumericTestRun {
	
	public static void main(String arg[]) {
		
		NumericTest isEven = (n) -> (n % 2) == 0;
		NumericTest isNegative = (n) -> (n < 0);
		
		System.out.println(isEven.computerTest(5));
		System.out.println(isNegative.computerTest(-5));
		System.out.println(isEven.computerTest(10));
		System.out.println(isNegative.computerTest(2));
		
		MyGreeting msg = (name) -> "Good Morning " + name + "!";
		System.out.println(msg.GreetingName("Anik"));
		System.out.println(msg.GreetingName("Ahad"));
		
	}
}
