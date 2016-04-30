package io.github.lunarfire.math;

import java.util.ArrayList;

public class Polynomial {
	private ArrayList<PolynomialTerm> terms;
	
	Polynomial()
	{
		terms = new ArrayList<PolynomialTerm>();
	}
	
	void addTerm(double constant, int exponent)
	{
		boolean inserted = false;
		int i = 0;
		
		while(!inserted)
		{
			if(i < terms.size())
			{
				if(exponent > terms.get(i).exponent)
				{
					//Insert in the array
					terms.add(i, new PolynomialTerm(constant, exponent));
					inserted = true;
				}
				else if(exponent == terms.get(i).exponent)
				{
					//Add to an already existing term
					terms.set(i, terms.get(i).add(constant));
					inserted = true;
				}
				else
				{
					i++;
				}
			}
			else
			{
				//Insert at the end of the array
				terms.add(i, new PolynomialTerm(constant, exponent));
				inserted = true;
			}
		}
	}

	public double evaluate(double value)
	{
		double sum = 0;
		double e = 0;
		double x = 1;
		
		for(int i = terms.size(); i > 0; i--)
		{
			PolynomialTerm p = terms.get(i - 1);
			while(e < p.exponent)
			{
				x *= value;
				e++;
			}
			
			sum += p.constant * x;
		}
		
		return sum;
	}
	
	@Override
	public String toString() {
		String s = "";
		
		if(terms.size() > 0)
		{
			for(int i = 0; i < (terms.size() - 1); i++)
				s += terms.get(i) + " + ";
			
			s += terms.get(terms.size() - 1);
		}
		
		return s;
	}
}
