package array.k_th;

import java.util.Arrays;

public class KThMaxminum {
	public static void main(String[] args) {
		int[] arr = new int[] {1,4,8,2,9};
		
		Arrays.sort(arr);
		
		int n = 3; // which item get in as max
		
		System.out.println(arr[arr.length-n]);
	}

}
