package searching;

import java.util.Arrays;

public class BinarySearch {
    static int search(int[] arr, int element){
        int n =arr.length;
        Arrays.sort(arr);
        Arrays.toString(arr);
        int s = n/2;
        int middle = arr[s];
        //System.out.println(middle);
        for (int i=0;i<arr.length;i++){

        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,6,2,7};
        search(arr, 4);
    }
}
