package main;

public class GreetingThreadRunner 
{

	public static void main(String[] args) 
	{
		GreetingRunnable r1 = new GreetingRunnable("Hello");
		GreetingRunnable r2 = new GreetingRunnable("Fiaz");
		GreetingRunnable r3 = new GreetingRunnable("Goodbye");
		
		r1.run();
		r2.run();
	}

}
