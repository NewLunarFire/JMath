/**
 * 
 */
package io.github.lunarfire.math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author tommy
 *
 */
public class ComplexTest {
	@Test
	public void CartesianCreationTest() {
		Complex c1 = new Complex(3.0, 2.0);
		Complex c2 = new Complex(2.0);
		
		assertEquals(3.0, c1.re, 0);
		assertEquals(2.0, c1.im, 0);
		assertEquals(2.0, c2.re, 0);
		assertEquals(0.0, c2.im, 0);
	}
	
	@Test
	public void PolarCreationTest() {
		Complex c1 = Complex.fromPolar(1.0, Math.PI / 4);
		Complex c2 = Complex.fromPolar(3.0, 5 * (Math.PI / 6));
		
		assertEquals(0.7071, c1.re, 0.01);
		assertEquals(0.7071, c1.im, 0.01);
		assertEquals(-2.5981, c2.re, 0.01);
		assertEquals(1.5, c2.im, 0.01);
	}

}
