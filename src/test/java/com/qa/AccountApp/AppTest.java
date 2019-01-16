package com.qa.AccountApp;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
	
	Service service = new Service();

	@Test
	public void test1() {
		//fail("fail");
		
	}
	
	@Test
	public void test2() {
		assertEquals(20, 10*2);
	}
	
	@Test
	public void testNumOfname() {
		service.makeAccount("Simon", "Simple", 5489);
		service.makeAccount("Simon", "Simple", 5489);
		service.makeAccount("Simon", "Simple", 5489);
		assertEquals(3,service.numberOfName("Simon"));
	}

}