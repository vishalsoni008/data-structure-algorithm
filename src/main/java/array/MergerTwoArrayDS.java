package array;

public class MergerTwoArrayDS {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{4,5,6};

       int[] merge = new int[arr1.length+ arr2.length];

       for (int i =0; i< arr1.length;i++){
           merge[i] = arr1[i];
       }
       for (int i=0;i<arr2.length;i++){
           merge[arr1.length+i] = arr2[i];
       }
       for (int i =0;i< merge.length;i++){
           System.out.print(merge[i]+ " ");
       }
    }
}
