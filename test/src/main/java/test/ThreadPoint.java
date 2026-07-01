package test;

public class ThreadPoint extends Point {
	
	private int z;
	
	public void display() {
		System.out.println("<<" +super.x+ ">>" +""+ "<<" +super.y+">>" +""+"<<" +z+">>");
	}

}
