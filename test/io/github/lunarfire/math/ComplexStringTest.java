package io.github.lunarfire.math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ComplexStringTest {
	@Test
	public void PositiveStringTest() {
		assertEquals("3.0 + 1.0i", new Complex(3.0, 1.0).toString());
	}
	
	@Test
	public void NegativeRealStringTest() {
		assertEquals("-3.0 + 1.0i", new Complex(-3.0, 1.0).toString());
	}
	
	@Test
	public void NegativeImaginaryTest() {
		assertEquals("-3.0 - 1.0i", new Complex(-3.0, -1.0).toString());
	}

}
