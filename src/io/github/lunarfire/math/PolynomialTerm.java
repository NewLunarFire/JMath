package io.github.lunarfire.math;

public class PolynomialTerm {
	public final double constant;
	public final int exponent;
	
	PolynomialTerm(double c)
	{
		constant = c;
		exponent = 0;
	}
	
	PolynomialTerm(double c, int e)
	{
		constant = c;
		exponent = e;
	}
	
	public PolynomialTerm add(double c)
	{
		return new PolynomialTerm(constant + c, exponent);
	}
	
	public PolynomialTerm substract(double c)
	{
		return new PolynomialTerm(constant - c, exponent);
	}
	
	public PolynomialTerm multiply(double c)
	{
		return new PolynomialTerm(constant * c, exponent);
	}
	
	public PolynomialTerm multiply(double c, int e)
	{
		return new PolynomialTerm(constant * c, exponent + e);
	}
	
	public PolynomialTerm multiply(PolynomialTerm p)
	{
		return new PolynomialTerm(constant * p.constant, exponent + p.exponent);
	}

	public PolynomialTerm divide(double c)
	{
		return new PolynomialTerm(constant / c, exponent);
	}
	
	public PolynomialTerm divide(double c, int e)
	{
		return new PolynomialTerm(constant / c, exponent - e);
	}
	
	public PolynomialTerm divide(PolynomialTerm p)
	{
		return new PolynomialTerm(constant / p.constant, exponent - p.exponent);
	}
	
	@Override
	public String toString()
	{
		String s = Double.toString(constant);
		
		if(exponent != 0)
		{
			s += "x";
			if(exponent != 1)
				s += this.toSuperScript(exponent);
		}
		
		return s;
	}
	
	private String toSuperScript(int n)
	{
		String r = "";
		String s = Integer.toString(n);
		
		for(int i = 0; i < s.length(); i++)
		{
			switch(s.charAt(i))
			{
				case '-':
					r += "⁻";
					break;
				case '0':
					r += "⁰";
					break;
				case '1':
					r += "¹";
					break;
				case '2':
					r += "²";
					break;
				case '3':
					r += "³";
					break;
				case '4':
					r += "⁴";
					break;
				case '5':
					r += "⁵";
					break;
				case '6':
					r += "⁶";
					break;
				case '7':
					r += "⁷";
					break;
				case '8':
					r += "⁸";
					break;
				case '9':
					r += "⁹";
					break;
			}
		}
		
		return r;
	}
}
