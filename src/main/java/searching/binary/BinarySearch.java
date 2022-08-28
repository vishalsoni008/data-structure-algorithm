package searching.binary;

// for bs we should have started array
// with out sorted array we can not find elements over there
//here as well we need to find mid element
//after check rest data is saller or bigger than of mid element

public class BinarySearch {

    static int search(int arr[], int start, int last, int toFind){

        while (last>=start) {

            int mid = start + (last - start) / 2;

            if (arr[mid] == toFind)
                return mid;

            if (arr[mid] > toFind)
                return search(arr, start, mid - 1, toFind);

            if (arr[mid] < toFind)
                return search(arr, mid + 1, last, toFind);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};

        int result = search(arr,0,arr.length-1,3);

        if(result == -1)
            System.out.println("that element is not present in array");

        else
            System.out.println("element present on index of "+result);
    }
}
