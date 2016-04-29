package io.github.lunarfire.math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class ComplexAddTest {
	@Test
	public void TwoComplexAdditionTest() {
		Complex c1 = new Complex(3.0, 2.0);
		Complex c2 = new Complex(2.0);
		
		Complex cx = c1.add(c2);
		assertEquals(5.0, cx.re, 0);
		assertEquals(2.0, cx.im, 0);
	}
	
	@Test
	public void ComplexDoubleAdditionTest() {
		Complex c1 = new Complex(6.0, 2.0);
		Complex cx = c1.add(3.5);
		
		assertEquals(9.5, cx.re, 0);
		assertEquals(2.0, cx.im, 0);
	}

}
