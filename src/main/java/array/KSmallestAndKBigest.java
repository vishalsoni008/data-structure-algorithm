package array;

import java.util.Arrays;
import java.util.Scanner;

public class KSmallestAndKBigest {
   static int findKSize(int[] arr,int k){
        Arrays.sort(arr);
        return arr[k-1];
   }
    public static void main(String[] args) {
        int[] arr = {1,6,33,8,2};
        System.out.println(findKSize(arr,3));
    }
}
