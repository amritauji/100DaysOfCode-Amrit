
// Adding two matrices
import java.util.*;;

public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat1 = new int[2][2];
        int[][] mat2 = new int[2][2];

        System.out.println("enter elements of first matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter elements of second matrixL");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        int[][] mat3 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("addition of two matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
