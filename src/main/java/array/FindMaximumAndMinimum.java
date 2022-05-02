package array;

import java.util.Arrays;

public class FindMaximumAndMinimum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,7,3};
        int max = 0;
        Arrays.sort(arr);
        System.out.println(arr[0]);

        for(int i= 0;i<arr.length;i++){
            max = arr[i];
        }
        System.out.println(max);
    }

}
