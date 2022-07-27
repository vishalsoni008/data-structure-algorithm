package sortings.bubble;

//in bubble sort they compare one element with other
//if that is smaller then that will swap element
//and that process do for all elements

public class BubbleSorting {
    public void sort(int[] arr){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void print(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,32,8,4};

        BubbleSorting sorting = new BubbleSorting();

        sorting.sort(arr);
        sorting.print(arr);
    }
}
