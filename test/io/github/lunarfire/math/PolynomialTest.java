package io.github.lunarfire.math;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PolynomialTest {
	Polynomial p1;
	Polynomial p2;
	
	@Before
	public void setUp() throws Exception {
		p1 = new Polynomial();
		p1.addTerm(2.0, 0);
		p1.addTerm(3.0, 1);
		p1.addTerm(1.0, 3);
		
		p2 = new Polynomial();
		p2.addTerm(1.0, 2);
		p2.addTerm(2.0, 1);
		p2.addTerm(3.0, 0);
	}

	@Test
	public void testEvaluate() {
		assertEquals(2.0, p1.evaluate(0), 0);
		assertEquals(38.0, p1.evaluate(3), 0);
		assertEquals(3.0, p2.evaluate(0), 0);
		assertEquals(27.0, p2.evaluate(4), 0);
	}

	@Test
	public void testToString() {
		assertEquals("1.0x³ + 3.0x + 2.0", p1.toString());
		assertEquals("1.0x² + 2.0x + 3.0", p2.toString());
	}

}
