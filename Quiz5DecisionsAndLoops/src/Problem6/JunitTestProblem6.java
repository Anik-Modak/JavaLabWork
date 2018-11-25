package Problem6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTestProblem6 {

	SpeedBreaker ans = new SpeedBreaker();
	
	@Test
	void test1() {
		assertEquals(ans.calculate(7.5), 1, "");
	}
	@Test
	void test2() {
		assertEquals(ans.calculate(1.6), 10, "");
	}
	@Test
	void test3() {
		assertEquals(ans.calculate(0.005), 40, "");
	}
}
