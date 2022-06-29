import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		//declaring an array of integers
		int array[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("Inserted array is: " + Arrays.toString(array));//input
		
		int n = array.length;
		//iterate array by comparing with adjacent elements 
		for(int i=0; i<n-1; i++)
			for(int j=0; j<n-i-1; j++)
				
				//swap of the data entered
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
		System.out.println("Sorted array: " + Arrays.toString(array));
	}
}
