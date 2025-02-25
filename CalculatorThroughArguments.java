package com.rts.basics;

import java.io.IOException;

public class CalculatorThroughArguments {
	public static void main(String args[]) throws IOException 
	{
		System.out.println("Enter A/a for Addition");
		System.out.println("Enter S/s for subtraction");
		System.out.println("Enter M/m for multiplication");
		System.out.println("Enter D/d for Division");
		int ch=System.in.read();
		switch(ch)
		{
		case 'a':
		case 'A':
			AdditionThroughArguments.main(args);
			break;
		case 'S':
		case 's':
			SubThroughArguments.main(args);
			break;
		case 'M':
		case 'm':
			MultiplyThroughArguments.main(args);
			break;
		case 'd':
		case 'D':
			DivisionThroughArgument.main(args);
			break;	
			default:
				System.out.println("Invalid choice");
				
			
		}
	}

}
