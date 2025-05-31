import java.util.*;

public class Day10 {
    public static boolean checkNeon(int n) {
        int product = n * n;
        int sum = 0;
        while (product > 0) {
            int a = product % 10;
            sum += a;
            product = product / 10;
        }

        if (sum == n) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number:");
        int num = sc.nextInt();
        if (checkNeon(num)) {
            System.out.println(" " + num + "is Neon number");
        } else {
            System.out.println(" " + num + "not a Neon number");
        }

    }
}
