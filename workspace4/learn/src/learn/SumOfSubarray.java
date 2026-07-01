package learn;

public class SumOfSubarray {

	public static void main(String[] args) {

		int[] arr = {1, 2,3,4,8,9,1,3,5};
		
//		int[] test = new int[4];
//		test.push(0);
		
		int n = arr.length;
		int sum=0;
		
		for(int i=0;i<n;i++) {
			int temp=0;
			for(int j=i;j<n;j++) {
				temp+=arr[j];
				sum+=temp;
			}
		}
		System.out.println(sum);
		
		
		int x = 2*n-2;
		int result=0;
		System.out.println(x);
		System.out.println(n);
		for(int i=0;i<n;i++) {
			result+=arr[i]*(n-i)*(i+1);
		}
		System.out.println("result"+result);
	}

}
