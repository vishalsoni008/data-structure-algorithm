package array;

public class RemoveEvenNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int odd = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2!=0){
                odd++;
            }
        }
        int[] result = new int[odd];
        int index = 0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]%2!=0){
                result[index++] = arr[i];
            }
        }
        for (int i =0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
