
// Remove all Occurrences of an Element from Array in Java
import java.util.*;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter number to remove:");
        int num = sc.nextInt();
    
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                result.add(arr[i]);
            }
        }
        System.out.println("Array after removing " + num + ":");
        for (int val : result) {
            System.out.println(val);
        }
    }
}
