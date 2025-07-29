package OperatorsQuestions;
import java.util.Scanner;

public class GreaterOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int greater = (a > b) ? a : b;

        System.out.println("The greater number is: " + greater);
        
        sc.close();
    }
}



