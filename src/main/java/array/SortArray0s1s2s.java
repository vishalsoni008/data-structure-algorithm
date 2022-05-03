package array;

import java.util.Arrays;

public class SortArray0s1s2s {
    public static void main(String[] args) {
        int[] arr = {0,0,2,2,1,0,1,1,2,2,0,1,1,2,2};
        System.out.println(arr[arr.length-4]);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
