package quadraticequationsolver;

import complexnumber.*;

public class QuadraticEquationSolver
{
	private double a;
    private double b;
    private double c;
    private double delta;
    
    public QuadraticEquationSolver(double a, double b, double c)
    {
    	if(a != 0)
			this.a = a;
		else
			throw new IllegalArgumentException("The value of A must be different from 0.");
    	this.b = b;
    	this.c = c;
    }
    
    public QuadraticEquationSolver()
    {
    	this.a = 0;
    	this.b = 0;
    	this.c = 0;
    }
    
    private void computeDeterminant()
    {
        this.delta = Math.pow(this.b, 2)-4*this.a*this.c;
    }
    
    public ComplexNumber computeX1()
    {
        this.computeDeterminant();
        ComplexNumber firstSolution = new ComplexNumber();
        if(this.delta < 0)
        {
            firstSolution.setReal(-this.b);
            firstSolution.setImmaginary(-(float)Math.sqrt(-this.delta));
        }
        else
        {
            firstSolution.setReal(-this.b-(float)Math.sqrt(this.delta));
            firstSolution.setImmaginary(0);
        }
        firstSolution.setReal(firstSolution.getReal()/(2*this.a));
        firstSolution.setImmaginary(firstSolution.getImmaginary()/(2*this.a));
        return firstSolution;
    }
    
    public ComplexNumber computeX2()
    {
    	this.computeDeterminant();
        ComplexNumber firstSolution = new ComplexNumber();
        if(this.delta < 0)
        {
            firstSolution.setReal(-this.b);
            firstSolution.setImmaginary((float)Math.sqrt(-this.delta));
        }
        else
        {
            firstSolution.setReal(-this.b+(float)Math.sqrt(this.delta));
            firstSolution.setImmaginary(0);
        }
        firstSolution.setReal(firstSolution.getReal()/(2*this.a));
        firstSolution.setImmaginary(firstSolution.getImmaginary()/(2*this.a));
        return firstSolution;
    }

	public double getA()
	{
		return a;
	}

	public void setA(double a)
	{
		if(a != 0)
			this.a = a;
		else
			throw new IllegalArgumentException("The value of A must be different from 0.");
	}

	public double getB()
	{
		return b;
	}

	public void setB(double b)
	{
		this.b = b;
	}

	public double getC()
	{
		return c;
	}

	public void setC(double c)
	{
		this.c = c;
	}
}