
public class Test {

	public static void main(String[] args) {
		int[] arr = new int []{6,2,3,45,33,22,11,0,9,10};
		int temp=0;
		/*for (int i=0; i<arr.length;i++){
			for(int j=i+1;j<arr.length; j++){
				if (arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}*/
		
		//Using single loop
		for (int i=0; i<arr.length-1;i++){
			if (arr[i]>arr[i+1]){
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				i=-1;
			}
			
		}
		
		for (int a:arr){
			System.out.println(a);
		}
		
		/*try{
			
			int c = 10/0;
			
		}
		finally{
			System.out.println("Hello");
		}*/
	}

}
