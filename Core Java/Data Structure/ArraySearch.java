import java.util.ArrayList;
import java.util.Collections;

public class ArraySearch {
	
	static int countOccurences(ArrayList<Integer> clist, int n)
	{
		return Collections.frequency(clist, n);
	}

	public static void main(String[] args) {
		
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int n=19;
		
		ArrayList<Integer> clist=new ArrayList<>();
		for(int i:arr)
			clist.add(i);
		
		System.out.println(n + " occurs " + countOccurences(clist, n) + " times");
		
	}
}
