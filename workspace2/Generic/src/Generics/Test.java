package Generics;

public class Test {

	public static void main(String[] args) {

		Box<String> str=new Box<>("Book");
		System.out.println(str.getValue());
		
		Box<Integer> itr = new Box<>(123);
		System.out.println(itr.getValue());
	}

}
