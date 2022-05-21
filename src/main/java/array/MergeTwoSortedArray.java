package array;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8};

        int[] arr3 = new int[arr1.length+ arr2.length];

        for (int i = 0;i< arr1.length;i++){
            arr3[i] = arr1[i];
        }

        for (int i = 0;i<arr2.length;i++){
            for (int j = 0;j<arr3.length;j++){
                if (arr2[i]<arr3[j]){
                    int temp = arr2[i];
                    arr2[i] = arr3[j];
                    arr3[j] = temp;
                }
                arr3[arr1.length+i] = arr2[i];
            }
        }
        for (int i =0;i< arr3.length;i++){
            System.out.print(arr3[i]+ " ");
        }
    }
}
