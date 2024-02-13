package project1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestCase
{
	@Test
	public void testMethod()
	{
		Calculator calc = new Calculator();
		
		assertEquals(calc.add(10, 8), 18);
		
	}
	
}