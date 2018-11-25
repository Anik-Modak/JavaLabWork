package Problem7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Problem6.SpeedBreaker;

class TacketSellerTest {
	
	TacketSeller ans = new TacketSeller();
	
	@Test
	void test1() {
		assertEquals(ans.calculate(3), 97, "");
	}
	@Test
	void test2() {
		assertEquals(ans.calculate(4), 93, "");
	}
	@Test
	void test3() {
		assertEquals(ans.calculate(1), 92, "");
	}

}
