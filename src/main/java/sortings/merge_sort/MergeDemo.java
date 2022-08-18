package sortings.merge_sort;
// merge sort work on divide and conqure
// so we create to method for those
//first is divide and second is conquer

public class MergeDemo {

    public static void devide(int[] arr, int start, int last){

        if (start>=last)
            return;

        int mid = start+(last-start)/2;
        devide(arr,start,mid);
        devide(arr,mid+1,last);
        conquer(arr,start,mid,last);
    }

    public static void conquer(int[] arr, int start, int mid, int last){
        int[] merged = new int[last-start+1];

        int idx1 = start;
        int idx2 = mid+1;
        int x= 0;

        while (idx1<=mid && idx2 <= last){
            if (arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }
            else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid){
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= last){
            merged[x++] = arr[idx2++];
        }

        for (int i=0,j=start;i<merged.length;i++,j++){
            arr[j] = merged[i];
        }
    }

    public static void print(int[] arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2,1,54,3,6,4,6};

        devide(arr,0, arr.length-1);
        print(arr);
    }
}