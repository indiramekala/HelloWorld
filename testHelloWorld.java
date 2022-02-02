package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testHelloWorld {

	@Test
	public void test() {
		JunitTest test = new JunitTest();
		String result = test.conCatination("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
