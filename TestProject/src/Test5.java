import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test5 {

	public static void main(String[] args) {
		/*Find out pairs in positive Integer Array where a sum of Integer in a pair is a Odd Number.
		Note: Pair can be formed via front or back element both ways. No Skipping of element to get the Odd number.
		Example 
		Input  : arr[] = {1, 2, 4 ,5}
		Output : [1,2] and [2,1] and [5,4] and [4,5]*/
		
		List<Integer> list  = new LinkedList<>();
		int [] arr = new int [] {1, 2, 4 ,5};
		
		Map<Integer, Integer> hm = new HashMap<>();
		
		for (int i=0; i<arr.length-1;i++){
			
			if((arr[i]+arr[i+1]) %2 !=0 || (arr[i+1]+arr[i]) %2 !=0){
				hm.put(arr[i], arr[i+1]);
			}
		}
		
		System.out.println(hm);
		
	}

}
