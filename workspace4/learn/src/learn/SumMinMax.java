package learn;

public class SumMinMax {

	public static void main(String[] args) {

		int arr[] = {3,-3,6,8,4,7,8,-2,0};
		int min = arr[0];
		int m = arr[0];
		
		for(int b:arr) {
			if(m<b) m=b;
			if(min>b) min =b;
		} System.out.println(m+min);  
	}

}
