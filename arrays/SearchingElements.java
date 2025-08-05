package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class SearchingElements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to search for an element among given elements
		int a[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an element to search in the given array: ");
		int x = sc.nextInt();
		int index=-1;
		boolean present = false;
		
		
		for(int i=0;i<a.length;i++) {
		   if(x==a[i]) {
			 present = true;
			  index = i;
			  break;
		   }
		}
		if(present)
			System.out.println("The entered number "+x+" is in the array at index " +index+ "th position");
		else System.out.println("The entered number "+x+" is not there in the array");

	}

}



