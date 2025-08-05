package arrays;
import java.io.IOException;
import java.util.Arrays;
public class GreatestElement {
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		//program to display smallest and largest element the array of elements
		int a[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(a));

        int smallest = a[0];
        int largest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < smallest)
                smallest = a[i];
            if (a[i] > largest)
                largest = a[i];
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);

	}

}



