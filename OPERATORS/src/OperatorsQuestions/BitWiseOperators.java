package OperatorsQuestions;

import java.io.IOException;
import java.util.Scanner;

public class BitWiseOperators {

	public static void main(String[] args) throws IOException{
		// Demonstrate bitwise AND, OR, XOR, and complement operators on two numbers
		System.out.println("Enter two numbers");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b= sc.nextInt();
		
		System.out.println("performed AND operator on given numbers:"+(a&b));
		System.out.println("performed OR operator on given numbers:"+(a|b));
		System.out.println("performed XOR operator on given numbers:"+(a^b));
		
		System.out.println("performed complement operator on given numbers:"+(~a));
		 

	}
	

}
