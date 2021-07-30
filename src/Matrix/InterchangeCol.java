package Matrix;

import java.util.Scanner;

public class InterchangeCol {

    int m, n;
    int [][] a;
    Scanner sc = new Scanner(System.in);

    public InterchangeCol (int x, int y) {
        m = x;
        n = y;
        a = new int[m][n];
    }

    public void readMatrix() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public void printMatrix() {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++ ) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void interchange() {
        System.out.println("Degistirilecek Sutun numarasını gir");
        int i = sc.nextInt();
        System.out.println("Hangi sutun ile değiştirileceğini belirten sutun numarasını girin");
        int j = sc.nextInt();

        for(int k = 0; k < m; k++) {
            int temp = a[k][i - 1];
            a[k][i - 1] = a[k][j - 1];
            a[k][j - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int x, y;
        InterchangeCol interchangeCol;

        Scanner sc = new Scanner(System.in);
        System.out.println("Satir sayisini gir");
        x = sc.nextInt();
        System.out.println("Sutun sayısını gir");
        y = sc.nextInt();
        interchangeCol = new InterchangeCol(x, y);
        interchangeCol.readMatrix();
        interchangeCol.printMatrix();
        interchangeCol.interchange();
        interchangeCol.printMatrix();
    }
}
