package searching;

public class LinearSearch {
    static int search(int arr[], int element){
        int n = arr.length;

        for (int i =0;i<n;i++){
            if (arr[i]==element){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,32,7,3,9};

        int result = search(arr, 6);

        if (result == 0){
            System.out.println("element is not present on that ");
        }
        else {
            System.out.println("element is resent on index "+result);
        }
    }
}
