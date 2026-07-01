package learn;

public class CountMax {

	public static void main(String[] args) {

		int arr[] = {0,0,0,1};
		int n = arr.length;
		
		int count = 0;
		int m = arr[0];
		
		for(int i = 0;i<n-1;i++) {
			if(arr[i]<arr[i+1]) {
				m=arr[i+1];
			}
		} 
		for(int j=0;j<n;j++) {
			if(m==arr[j]) {
				count++;
			}
		} 
		System.out.println(n-count);
		
	}

}
