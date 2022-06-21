package searching;


public class BinarySearch {

    static int binarySearch(int[] arr, int n){
        int low =0;
        int high = arr.length-1;

        while (low<=high){
            int mid = (high+low)/2;

            if(arr[mid] == n){
                return arr[mid];
            }
            if(n<arr[mid]){
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};

        System.out.println(binarySearch(arr,2));

    }
}
