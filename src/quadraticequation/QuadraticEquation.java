package quadraticequation;

import quadraticequationsolver.*;
import complexnumber.*;
import java.io.*;

public class QuadraticEquation
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(input);
        String readOutput = null;
        boolean correctOutput = false;
        System.out.println("Welcome into the most innovative software for the computing of quadratic equations solutions");
        QuadraticEquationSolver quadraticEquation = new QuadraticEquationSolver();
        while(!correctOutput)
        {
            System.out.print("Enter the coefficient A: ");
            readOutput = keyboard.readLine();
            try
            {
                quadraticEquation.a = Double.valueOf(readOutput).doubleValue();
                correctOutput = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("You entered an incorrect number!");
            }
        }
        correctOutput = false;
        while(!correctOutput)
        {
            System.out.print("Enter the coefficient B: ");
            readOutput = keyboard.readLine();
            try
            {
                quadraticEquation.b = Double.valueOf(readOutput).doubleValue();
                correctOutput = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("You entered an incorrect number!");
            }
        }
        correctOutput = false;
        while(!correctOutput)
        {
            System.out.print("Enter the coefficient C: ");
            readOutput = keyboard.readLine();
            try
            {
                quadraticEquation.c = Double.valueOf(readOutput).doubleValue();
                correctOutput = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("You entered an incorrect number!");
            }
        }
        ComplexNumber x1 = quadraticEquation.computeX1();
        ComplexNumber x2 = quadraticEquation.computeX2();
        System.out.println("x1: " + x1.formatComplexNumber());
        System.out.println("x2: " + x2.formatComplexNumber());
    }
}