package hW_OOP_Lecture5;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0,"Cat");
        list.add(1,"Dog");
        list.add(2,"Mouse");
        list.add(3,"Parrot");
        list.add(4,"Fishes");
        list.add(5,"Monkey");
        list.add(6,"Lion");
        list.add(7,"Hippopotamus");

        System.out.println(list);

        list.remove(2);
        list.remove(4);
        list.remove(5);

        System.out.println(list.size());
        System.out.println(list);

    }
}
