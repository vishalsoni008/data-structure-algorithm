package array;

import java.util.Arrays;

public class MergeTwoArray {

    public static void main(String[] args) {
        int arr1[] = {1,8,2,5};
        int arr2[] = {1,9,3,7};
//
//        List list = Arrays.asList(arr1);
//        list.add(arr2);
//
//        Object[] ob = list.toArray();
//        Arrays.sort(ob);
//        for (int i=0;i< ob.length;i++){
//            System.out.print(ob[i]+" ");
//        }

        int[] arr3 = new int[arr1.length+ arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
