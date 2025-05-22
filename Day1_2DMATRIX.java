import java.util.*;

public class Day1_2DMATRIX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows: ");
        int row = sc.nextInt();
        System.out.println("enter columns: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        if (row == col) {
            System.out.println("enter the elements of 2D array:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Error,enter same row and column");
        }

        System.out.println();

        // TRANSPOSE OF A MATRIX

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // print transpose matrix
        System.out.println("Transpose: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // ROTATION OF 2DMATRIX CLOCKWISE 90 DEGREES
        System.out.println("90 degree 2d matrix rotation");
        for (int i = 0; i < row; i++) {
            int left = 0, right = col - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;

                left++;
                right--;

            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}