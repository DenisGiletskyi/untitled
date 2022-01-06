package hW_OOP_Lecture5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }

        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            Integer integer = listIterator.next();
            System.out.println(integer);
        }

        for (Integer arr : list
        ) {
            System.out.println(arr);
        }
    }
}
