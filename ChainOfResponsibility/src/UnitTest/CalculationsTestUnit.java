package UnitTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ChainPattern.AddNumbers;
import ChainPattern.Chain;
import ChainPattern.DivNumbers;
import ChainPattern.MultiplyNumbers;
import ChainPattern.Numbers;
import ChainPattern.SubNumbers;

class CalculationsTestUnit
{
	
	Chain chain1 = new AddNumbers();
	Chain chain2 = new SubNumbers();
	Chain chain3 = new MultiplyNumbers();
	Chain chain4 = new DivNumbers();
	
	void Setup()
	{
		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
		chain3.setNextChain(chain4);
	}
	
	@Test
	void testAddition()
	{
		Setup();
		Numbers request = new Numbers(10, 5, "add");
		assertEquals(15, chain1.calculate(request), " ");
	}
	
	@Test
	void testSubtraction()
	{
		Setup();
		Numbers request = new Numbers(10, 5, "sub");
		assertEquals(5, chain1.calculate(request), " ");
	}
	
	@Test
	void testMultiplicationNumbers()
	{
		Setup();
		Numbers request = new Numbers(10, 5, "multiply");
		assertEquals(50, chain1.calculate(request), " ");
	}
	
	@Test
	void testDivision()
	{
		Setup();
		Numbers request = new Numbers(10, 5, "div");
		assertEquals(2, chain1.calculate(request), " ");
	}
	
	@Test
	void testOthers()
	{
		Setup();
		Numbers request = new Numbers(10, 5, "pow");
		assertEquals(-1, chain1.calculate(request), " ");
	}
}
