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
	@Test
	void test()
	{
		Chain chain1 = new AddNumbers();
		Chain chain2 = new SubNumbers();
		Chain chain3 = new MultiplyNumbers();
		Chain chain4 = new DivNumbers();

		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
		chain3.setNextChain(chain4);
		
		Numbers request = new Numbers(10, 5, "add");
		assertEquals(15, chain1.calculate(request), " ");

	}
}
