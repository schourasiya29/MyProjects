import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {

	public static void main(String[] args) {
		String s = "This a a Beautiful Place";
		 
		String[] s1 = s.split(" ");
		
		String res= "";
						
		for (String s3 : s1 ){
			
			Pattern p = Pattern.compile("[A-Z]");
			
			Matcher m =p.matcher(s3);
			
			while(m.find()){
				System.out.println(m.group());
				res +=s3.charAt(0);
			}
			
		
		}		
		System.out.println(res);
		
		
	}

	
}
