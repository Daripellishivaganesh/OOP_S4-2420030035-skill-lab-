package OperatorsQuestions;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		// Perform addition, subtraction, multiplication, division, and modulus of two numbers
		System.out.println("Enter two numbers");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b= sc.nextInt();
		
		
		
		System.out.println("The addition of numbers is"+(a+b));
		System.out.println("The Multiplication of numbers is "+(a*b));
		System.out.println("The substraction of numbers is "+(a-b));
		System.out.println("The division of numbers is "+(a/b));
		System.out.println("The modulus of numbers is "+(a%b));
}
}