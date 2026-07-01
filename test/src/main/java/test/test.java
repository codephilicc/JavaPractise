package test;

public class test {

	public static void main(String[] args) {
		
		String s = "java";
		String s1 = "java";
		
		String s2 = new String("java");
		String s3 = new String("java");
		
		StringBuffer sb1 = new StringBuffer("java");
		StringBuffer sb2 = new StringBuffer("java");
		
//		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
//		
		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
		
		System.out.println(s==s1);
//		System.out.println(s1==s2);
		System.err.println(sb1==sb2);
		
//		System.out.println(s1.equals(s2));
//		
//		System.out.println(s2.equals(s3));
//		System.out.println(sb1.equals(sb2));
//		
//		
//		System.out.println(sb1.hashCode());
//		System.out.println(sb2.hashCode());
		
		
	}
	

	
	
}
