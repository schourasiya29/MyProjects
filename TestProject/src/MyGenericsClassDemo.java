
class Generics<T>{
	
	private T t;

	Generics(T t){
		this.t =t;
	}
	
	public void show(){
		
		System.out.println("The object is of type: "+t.getClass().getName());
	}
	
	public T getObj(){
		return t;
	}
	
}

public class MyGenericsClassDemo {

	public static void main(String[] args) {
		Generics<String> gen = new Generics<String>("Sachin");
		Generics<Integer> gen1 = new Generics<Integer>(10);
		gen.show();
		gen1.show();
		System.out.println(gen.getObj());
		System.out.println(gen1.getObj());
	}

}
