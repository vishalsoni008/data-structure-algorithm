package array.twod;

public class SimpleTwoDArray {
    public static void main(String[] args) {

        //here 1 re-present row and second is colum
        int[][] arr = {
            {1,2,3,4},
            {1,1,1,1},
            {2,2,2,2}
        };
        for (int i =0; i<3;i++){
            for (int j = 0;j<4;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
