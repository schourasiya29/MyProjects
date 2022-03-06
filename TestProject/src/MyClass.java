import java.util.TreeSet;

public class MyClass {

	public static void main(String[] args) {
		int N =5;
		int[] arr= new int[]{1,2,3,4,5};
		int res=0;
		
	res=farthestFromZero( N,arr);
	System.out.println(res);
	}

	public static int farthestFromZero(int N, int[] arr) {
		
		
		TreeSet<Integer> tset = new TreeSet<Integer>();
		for (int i=0; i<N;i++){
			tset.add(arr[i]);
		}
		
		int minV = tset.first();
		int maxV = tset.last();
		
		if (Math.abs(minV)>=maxV){
			return minV;
		}
		return maxV;
	}

}
