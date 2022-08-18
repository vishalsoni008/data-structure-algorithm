package searching.linear;

public class LinearSearch {

    static int search(int arr[], int toFind){
        for (int i=0;i<arr.length-1;i++){
            if (arr[i] == toFind){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,3,2,4,64,9};

        int result = search(arr,2);

        if (result == -1)
            System.out.println("element is not present in that array");

        else
            System.out.println("element present in index of "+result);
    }
}
