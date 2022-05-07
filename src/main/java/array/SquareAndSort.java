package array;

import java.util.Arrays;

public class SquareAndSort {
    static void sqaue(int arr[]){
        int n =arr.length;

        for(int i = 0;i<n;i++){
            arr[i] = arr[i]*arr[i];
        }
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4};

        sqaue(arr);

        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
