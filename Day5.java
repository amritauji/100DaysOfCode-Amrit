import java.util.*;

public class Day5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if (a[i] > max1) {
                    max2 = max1;
                    max1 = a[i];
                } else if (a[i] > max2 && a[i] != max1) {
                    max2 = a[i];
                }
            }
            System.out.println(max1 + max2);
            t--;
        }
    }
}