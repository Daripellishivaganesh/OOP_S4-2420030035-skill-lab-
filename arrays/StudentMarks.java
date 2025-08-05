package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class StudentMarks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to take student's six subject's marks and print the subject marks, total, average.
		Scanner sc = new Scanner(System.in);
		int Total=0;
		int arr[] = new int[6];
	System.out.println("Enter your 6 subject marks: ");
	for(int i=0 ; i<6 ;i++) {
		arr[i]=sc.nextInt();
		Total += arr[i];
		
	}
	int Average = Total/6;
	System.out.println("Your marks are : "+ Arrays.toString(arr));
	System.out.println("Your total marks are : "+Total);
	System.out.println("Average of your marks are: "+Average);
	

	}

}



