// TO FIND THE MAXIMUM IN THE ARRAY

import java.util.*;

public class Day1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        System.out.println("enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(
                "enter your choice: \n to find maximum ->1 \n to find sum of array ->2 \n to reverse the array ->3 \n to print the subarray ->4");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                // to find max
                System.out.println("To find maximum");
                int max = Integer.MIN_VALUE;
                

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
                System.out.println("maximum element:" + max);
                break;
            case 2:
                // TO FIND THE SUM OF THE ELEMENTS IN THE ARRAY
                System.out.println("to find the maximum elements of array");
                int sum = 0;

                for (int i = 0; i < arr.length; i++) {
                    sum = sum + arr[i];
                }

                System.out.println("sum of array:" + sum);
                break;
            case 3:
                // TO REVERSE THE ARRAY

                int s = 0;
                int t = arr.length - 1;

                while (s < t) {
                    int temp = arr[s];
                    arr[s] = arr[t];
                    arr[t] = temp;

                    s++;
                    t--;
                }
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;
            case 4:
                // To print the subarrays

                System.out.println("To print the subarrays");
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i; j < arr.length; j++) {

                        for (int k = i; k <= j; k++) {
                            System.out.print(arr[k]);
                        }
                        System.out.println();
                    }
                }
                break;
            default:
        }

    }

}
