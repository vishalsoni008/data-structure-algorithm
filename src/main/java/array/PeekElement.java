package array;

public class PeekElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,5,6,9};
        int peek = 0;
        for (int i = 0;i< arr.length;i++){
            peek = arr[i];
        }
        System.out.println(peek);
    }
}
