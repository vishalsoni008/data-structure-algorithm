package sortings.merge_sort;

public class MergeSort {
    public static void divide(int[] arr, int startIndex, int lastIndex){

        if(startIndex>=lastIndex){
            return;
        }

        int mid = startIndex+(lastIndex-startIndex)/2;
        divide(arr, startIndex, mid);
        divide(arr, mid+1, lastIndex);
        conquer(arr, startIndex,mid,lastIndex);
    }

    public static void conquer(int arr[], int startIndex, int mid, int lastIndex){
        int merged[] = new int[lastIndex-startIndex+1];

        int index_1 = startIndex;
        int index_2 = mid+1;
        int x= 0;

        while (index_1 <= mid && index_2 <= lastIndex){
            if(arr[index_1] <= arr[index_2]){
                merged[x] = arr[index_1];
                x++;
                index_1++;
            }
            else {
                merged[x] = arr[index_2];
                x++;
                index_2++;
            }
        }

        while (index_1 <=mid){
            merged[x++] = arr[index_1++];
        }

        while (index_2 <=lastIndex){
            merged[x++] = arr[index_2++];
        }

        for (int i= 0,j = startIndex;i< merged.length;i++,j++){
            arr[j] = merged[i];
        }
    }

    public static void print(int arr[]){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3,2,6,13,7};
        int n = arr.length;

        divide(arr,0,n-1);
        print(arr);
    }
}
