package OperatorsQuestions;

import java.io.IOException;
import java.util.Scanner;

public class ValuesComparision {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b= sc.nextInt();
		if(a>b) {
			System.out.println("Greater value is "+a);
		}
		else {
			System.out.println("Greater value is "+b);
			
		}
	}

}
