package Array;

/**
 * Write a Java program to add two matrices of the same size
 */
public class AddTwoMatrices {

    public static void main(String[] args) {
        int [][] firstArray = {{1,5,3},{2,1,3},{3,2,1}};
        int [][] secondArray = {{2,4,4},{3,2,1},{1,3,2}};
        int length = firstArray.length;
        int [][] sum = new int[3][3];

        for(int i = 0; i<length; i++) {
            for(int j = 0; j<length; j++) {
                sum[i][j] = firstArray[i][j] + secondArray[i][j];
                System.out.print(sum[i][j]);
            }
            System.out.println();
        }


    }
}
