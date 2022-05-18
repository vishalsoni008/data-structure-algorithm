package array.subarray;

import java.util.Arrays;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {5,3,6,4,7};

        int[] subarray = Arrays.copyOfRange(arr,0,3);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(subarray));
    }
}
