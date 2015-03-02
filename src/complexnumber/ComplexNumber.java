package complexnumber;

public class ComplexNumber
{
    public double real;
    public double immaginary;
    
    public String formatComplexNumber()
    {
        String solution = this.real + "+(" + this.immaginary + ")i";
        return solution;
    }
}