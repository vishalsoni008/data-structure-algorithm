package array.k_th;

import java.util.Arrays;

public class K_ThSmallElement {
	public static void main(String[] args) {
		
		int arr[] = new int[] {1,5,2,7};
		
		Arrays.sort(arr);
		
		int[] arr2 = new int[arr.length];
		
		for(int i = arr.length-1;i>=0;i--) {
			arr2[i] = i;
		}
		
		int n =2;
		
		System.out.println(arr2[arr2.length-n]);
	}

}
