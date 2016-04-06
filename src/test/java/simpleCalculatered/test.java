package simpleCalculatered;

import static org.junit.Assert.*;

public class test{
	
	@Test
	public void testAdd() {
		Calculated calc = new calculated();
		calc.add(10,20);
		assertEquals(30, calc.getResult());
	}
}
