import static org.junit.Assert.*;

import org.junit.Test;

public class TestExpression {

	@Test
	public void test1() {
		Lab1 lab1 = new Lab1();
		int result = lab1.expression("3*x+2*y*y+z");
		assertEquals(1, result);
	}
	@Test
	public void test2() {
		Lab1 lab1 = new Lab1();
		int result = lab1.expression("!simplify x=2");
		assertEquals(2, result);
	}
	@Test
	public void test3() {
		Lab1 lab1 = new Lab1();
		int result = lab1.expression("!d/d y");
		assertEquals(3, result);
	}
	@Test
	public void test4() {
		Lab1 lab1 = new Lab1();
		int result = lab1.expression("3x=2");
		assertEquals(0, result);
	}

}
