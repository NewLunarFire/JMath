package io.github.lunarfire.math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PolynomialTermTest {
	PolynomialTerm p1;
	PolynomialTerm p2;
	PolynomialTerm p3;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		p1 = new PolynomialTerm(3.0);
		p2 = new PolynomialTerm(1.0, 1);
		p3 = new PolynomialTerm(5.0, 3);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void PolynomialTermConstructorTest() {
		assertEquals(3.0, p1.constant, 0);
		assertEquals(0, p1.exponent, 0);
		assertEquals(1.0, p2.constant, 0);
		assertEquals(1, p2.exponent);
	}
	
	@Test
	public void PolynomialTermAdditionTest() {
		PolynomialTerm px = p1.add(4.5);
		PolynomialTerm py = p2.add(3.0);
		
		assertEquals(7.5, px.constant, 0);
		assertEquals(4.0, py.constant, 0);
	}
	
	@Test
	public void PolynomialTermMultiplyTest() {
		PolynomialTerm px = p1.multiply(5.0);
		PolynomialTerm py = p1.multiply(p2);
		
		assertEquals(15.0, px.constant, 0);
		assertEquals(0, px.exponent);
		assertEquals(3.0, py.constant, 0);
		assertEquals(1, py.exponent);
	}
	
	@Test
	public void PolynomialTermStringTest() {
		assertEquals("3.0", p1.toString());
		assertEquals("1.0x", p2.toString());
		assertEquals("5.0x³", p3.toString());
	}
	
	

}
