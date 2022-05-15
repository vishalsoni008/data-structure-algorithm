package array;

import java.util.Arrays;

public class CyclicRotate {

    static int[] arr = new int[]{1,2,3,4};

    public static void rotate(){
        int x = arr[arr.length-1],i;
        for (i = arr.length-1; i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = x;
    }

    public static void main(String[] args) {
        //ouptut shuild be = 4,1,2,3
        System.out.println("Array before rotate "+ Arrays.toString(arr));

        rotate();

        System.out.println("array after rotate "+Arrays.toString(arr));
    }
}
