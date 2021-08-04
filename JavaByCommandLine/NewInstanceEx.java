public class NewInstanceEx {

	public static void main(String[] args)  throws Exception
	{
    Object obj =Class.forName(args[0]).newInstance();
    System.out.println("Object Created for " + obj.getClass().getName());
	}

}
