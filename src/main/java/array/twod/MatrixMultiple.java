package array.twod;

public class MatrixMultiple {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1},
                {1, 1}};
        int[][] arr2 = {
                {1, 1},
                {1, 1}};

        for (int i= 0;i<2;i++){
            for (int j =0;j<2;j++){

                System.out.print(arr[i][j]*arr2[i][j]+arr2[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
