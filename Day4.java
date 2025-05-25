// Take discount or Not
// Determine whether Chef should buy the discount coupon or not. Chef will buy the discount coupon if and only if the total price he pays after buying the discount coupon is strictly less than the price he pays without buying the discount coupon.

import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int totalWithoutCoupon = 0;
            int totalWithCoupon = x;

            for (int i = 0; i < n; i++) {
                totalWithoutCoupon += a[i];
                totalWithCoupon += Math.max(a[i] - y, 0);
            }

            if (totalWithCoupon < totalWithoutCoupon) {
                System.out.println("COUPON");
            } else {
                System.out.println("NO COUPON");
            }
        }
    }
}
