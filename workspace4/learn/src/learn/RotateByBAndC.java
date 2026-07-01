//package learn;
//
//import java.util.Arrays;
//
//public class RotateByBAndC {
//
//	public static void main(String[] args) {
//
//		int[] A = {1, 2, 3, 4,5,6,7,8,9};
//		int n = A.length;;
//		int B = 3;
//		int C = 6;
//		
//		for(int i = 0;i<n/2;i++) {
//			int temp = 0;
//			temp = A[n-i-1];
//			A[n-i-1]=A[i];
//			A[i]=temp; 
//		}
//		System.out.println(Arrays.toString(A));
//		for(int i = 0;i<B/2;i++) {
//			int temp = 0;
//			temp = A[B-i-1];
//			A[B-i-1]=A[i];
//			A[i]=temp; 
//		}
//		System.out.println(Arrays.toString(A));
//		int n1 = C-B;
//		for(int i = B+1;i<n1/2;i++) {
//			int temp = 0;
//			temp = A[C-i-1];
//			A[C-i-1]=A[i];
//			A[i]=temp; 
//		}
//		System.out.println(Arrays.toString(A));
//		
// 	}
//
//}
