package learn;

public class CountMaxNumber {

	public static void main(String[] args) {

		int[] arr = {2,5,3,4,17,16};
		
		int count = 1;
		int max = arr[0];
		int n = arr.length;
		for(int i =1;i<n;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
				count++;
			}
		} 
		System.out.println(count);
		
	}

}
