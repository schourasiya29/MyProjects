
//Code to find second smallest no. in an array
public class Test3 {

	public static void main(String[] args) {

		int [] arr = new int[] {5,3,1,6,2,8,9,10};
		
		int smallno = arr[0];
		
		for (int i=1;i<arr.length;i++){
			
			if(smallno>arr[i]){
				
				smallno=arr[i];
				
			}
			
		}
		System.out.println(smallno);
	}

}
