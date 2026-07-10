
public class Test {

	public static void main(String[] args) {

		Generics.Box<String> str=new Generics.Box<>("Book");
		System.out.println(str.getValue());
		
		Generics.Box<Integer> itr = new Generics.Box<>(123);
		System.out.println(itr.getValue());
	}

}
