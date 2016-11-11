import static org.junit.Assert.*;

import org.junit.Test;

public class TestSimplify {

	@Test
	public void test1() {
		Lab1 lab1 = new Lab1();
		lab1.setExp("3*x+2*y*y");
		lab1.setCommand("x=2");
		String result = lab1.simplify();
		assertEquals("2*y*y+6", result);
	}
	@Test
	public void test2() {
		Lab1 lab1 = new Lab1();
		lab1.setExp("3*x+2*y*y");
		lab1.setCommand("x=2 y=3");
		String result = lab1.simplify();
		assertEquals("24", result);
	}
	@Test
	public void test3() {
		Lab1 lab1 = new Lab1();
		lab1.setExp("3*x+2*y*y");
		lab1.setCommand("");
		String result = lab1.simplify();
		assertEquals(null, result);
	}
	@Test
	public void test4() {
		Lab1 lab1 = new Lab1();
		lab1.setExp("3*x+2*y*y");
		lab1.setCommand("z=1");
		String result = lab1.simplify();
		assertEquals("3*x+2*y*y", result);
	}

}
