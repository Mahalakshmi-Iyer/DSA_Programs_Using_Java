package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class BasicOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        list.add(1, 9);
        System.out.println(list);

        System.out.println(list.get(2));
        list.remove(1);
        System.out.println(list);

        list.set(3, 7);
        System.out.println(list);

        System.out.println(list.contains(9));
        System.out.println(list.contains(7));

        System.out.println(list.size());
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
