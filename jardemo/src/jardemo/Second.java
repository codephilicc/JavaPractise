package jardemo;

class Parent{
	String x = "Parent's x";

	public void print() {
		System.out.println(x);
	}
}

class ChildClass extends Parent{
	String x = "Child's x";
	
	public void print() {
		System.out.println(x);
//		System.out.println(super.x);
	}
}

public class Second{
	
	public static void main(String[] args) {
//		Parent obj1 = new Parent();
//		obj1.print();
		
//		ChildClass obj2 = new ChildClass();
//		obj2.print();
//		
		Parent obj3 = new ChildClass();
		System.out.println(obj3.x);
		obj3.print();
//		Parent obj4 = new Parent();
//		obj4.print();
		
	}
}

 