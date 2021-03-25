package lesson23;

import java.util.ArrayList;

public class ArrayListIntr {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        System.out.println(list.isEmpty());
        System.out.println(list.size());

        list.add("GOTR");
        list.add(0, "Bor");
        list.set(0, "123");

        for (String str : list) {
            System.out.println(str);
        }
        ArrayList<String> temp = new ArrayList<>();
        temp.add("HUGO");
        temp.add("HUGO");
        temp.add("HUGO");
        temp.add("HUGO");
        list.addAll(temp);
        list.addAll(1, temp);
        list.remove(1);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
