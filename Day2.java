import java.util.*;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // add
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println(list);
        // add at index

        list.add(1, 10);
        list.add(3, 30);
        System.out.println(list);

        // get
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        // set
        list.set(1, 100);
        System.out.println(list);

        // remove
        list.remove(2);
        System.out.println(list);

        // size
        System.out.println(list.size());

    }
}
