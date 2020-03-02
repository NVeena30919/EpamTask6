package epam.Task3_Calculator;

import java.util.Scanner;

public class Calculator  
{
	public static double operand1;
	public static double operand2;
	public static char operator;
	private static Scanner sc;
	public static void calculate() 
	{ 
		double result = Double.NaN; 
		switch(operator) 
		{ 
			case '+': 
					result = operand1 + operand2; 
					break; 
			case '-': 
					result = operand1 - operand2; 
					break; 
			case '*': 
					result = operand1 * operand2; 
					break; 
			case '/': 
					result = operand1 / operand2; 
					break; 
			default: 
					System.out.printf("Unrecognised operator %c\n", operator); 
		} 
		System.out.printf("%f %c %f = %f\n",   operand1, operator, operand2, result); 
	}
	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		String a = sc.next();
		char o = sc.next().charAt(0);
		String b = sc.next();
		Calculator.operand1=Double.parseDouble(a);
		Calculator.operator = o;
		Calculator.operand2 = Double.parseDouble(b); 
		Calculator.calculate(); 
	} 
}
