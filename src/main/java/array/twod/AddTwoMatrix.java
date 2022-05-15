package array.twod;

public class AddTwoMatrix {
    public static void main(String[] args) {
        int arr1[][] = {
                {1,2},
                {1,2}
        };
        int arr2[][] = {
                {2,1},
                {2,1}
        };
        for (int i =0; i<2;i++){
            for (int j =0;j<2;j++){
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
