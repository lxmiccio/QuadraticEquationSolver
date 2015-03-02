package quadraticequationsolver;

import complexnumber.*;

public class QuadraticEquationSolver
{
    public double a;
    public double b;
    public double c;
    private double delta;
    
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
            firstSolution.real = -this.b;
            firstSolution.immaginary = -(float)Math.sqrt(-this.delta);
        }
        else
        {
            firstSolution.real = -this.b-(float)Math.sqrt(this.delta);
            firstSolution.immaginary = 0;
        }
        firstSolution.real /= (2*this.a);
        firstSolution.immaginary /= (2*this.a);
        return firstSolution;
    }
    
    public ComplexNumber computeX2()
    {
    	this.computeDeterminant();
        ComplexNumber secondSolution = new ComplexNumber();
        if(this.delta < 0)
        {
            secondSolution.real = -this.b;
            secondSolution.immaginary = (float)Math.sqrt(-this.delta);
        }
        else
        {
            secondSolution.real = -this.b+(float)Math.sqrt(this.delta);
            secondSolution.immaginary = 0;
        }
        secondSolution.real /= (2*this.a);
        secondSolution.immaginary /= (2*this.a);
        return secondSolution;
    }
}