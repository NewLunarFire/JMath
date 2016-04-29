package io.github.lunarfire.math;

public class Complex {
	public final double re;
	public final double im;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(im);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(re);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complex other = (Complex) obj;
		if (Double.doubleToLongBits(im) != Double.doubleToLongBits(other.im))
			return false;
		if (Double.doubleToLongBits(re) != Double.doubleToLongBits(other.re))
			return false;
		return true;
	}

	public Complex(double real)
	{
		re = real;
		im = 0;
	}
	
	public Complex(double real, double imag)
	{
		re = real;
		im = imag;
	}
	
	public static Complex fromPolar(double radius, double phase)
	{
		return new Complex(radius*Math.cos(phase), radius*Math.sin(phase));
	}
	
	public double real()
	{
		return re;
	}
	
	public double imaginary()
	{
		return im;
	}
	
	public Complex add(double d)
	{
		return new Complex(this.re + d, this.im);
	}
	
	public Complex add(Complex c)
	{
		return new Complex(this.re + c.re, this.im + c.im);
	}

	@Override
	public String toString() {
		if(im < 0)
			return re + " - " + (-im) + "i";
		else
			return re + " + " + im + "i";
	}
	
	
}
