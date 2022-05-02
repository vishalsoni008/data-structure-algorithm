package array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println("before reverse array is "+ Arrays.toString(arr));
        for (int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
