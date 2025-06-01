import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the array elements");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the number to check:");
        int same = sc.nextInt();
        System.out.println("the same element are present at index:");
        for (int i = 0; i < 5; i++) {
            if (arr[i] == same) {
                System.out.print(i + " ");
            }
        }

    }
}
