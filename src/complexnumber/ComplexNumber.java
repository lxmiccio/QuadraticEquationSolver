package complexnumber;

public class ComplexNumber
{
	private double real;
    private double immaginary;
    
    public String formatComplexNumber()
    {
        String solution = this.real + "+(" + this.immaginary + ")i";
        return solution;
    }
    
	public double getReal()
	{
		return real;
	}

	public void setReal(double real)
	{
		this.real = real;
	}

	public double getImmaginary()
	{
		return immaginary;
	}

	public void setImmaginary(double immaginary)
	{
		this.immaginary = immaginary;
	}
}