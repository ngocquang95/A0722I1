package comparator_comparable.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(-10);
        list.add(50);
        list.add(40);

        //Collections.sort(list); // tăng dần
        Collections.sort(list, Collections.reverseOrder()); // giảm dần

        System.out.println(list);
    }
}
