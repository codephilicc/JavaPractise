package test;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 2, 1, 4, 1, 6, 0, 9, 5, 2, 3, 1, 7, 8, 0, 1 };

		int s = 3;
		int e = 11;
		int temp = 0;

		while (s < e) {

			temp = arr[e];
			arr[e] = arr[s];
			arr[s] = temp;
			s++;
			e--;
		}
		System.out.println(Arrays.toString(arr));

	}

}
