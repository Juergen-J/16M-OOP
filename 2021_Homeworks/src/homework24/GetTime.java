package homework24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GetTime {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        long startTime;
        long endTimeArrayList;
        long endTimeLinkedList;

        startTime = System.currentTimeMillis();
        addToBegin(arrayList);
        endTimeArrayList = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        addToBegin(linkedList);
        endTimeLinkedList = System.currentTimeMillis() - startTime;
        System.out.printf("Lead time of addToBegin for ArrayList: %.3f s. \n Lead time of addToBegin for LinkedList: %.3f s. \n ",
                (double) endTimeArrayList / 1000, (double) endTimeLinkedList / 1000);
        System.out.println("**********************************************************");

        startTime = System.currentTimeMillis();
        addToMiddle(arrayList);
        endTimeArrayList = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        addToMiddle(linkedList);
        endTimeLinkedList = System.currentTimeMillis() - startTime;
        System.out.printf("Lead time of addToMiddle for ArrayList: %.3f s. \n Lead time of addToMiddle for LinkedList: %.3f s. \n ",
                (double) endTimeArrayList / 1000, (double) endTimeLinkedList / 1000);
        System.out.println("**********************************************************");

        startTime = System.currentTimeMillis();
        addToEnd(arrayList);
        endTimeArrayList = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        addToEnd(linkedList);
        endTimeLinkedList = System.currentTimeMillis() - startTime;
        System.out.printf("Lead time of addToEnd for ArrayList: %.3f s. \n Lead time of addToEnd for LinkedList: %.3f s. \n ",
                (double) endTimeArrayList / 1000, (double) endTimeLinkedList / 1000);
        System.out.println("**********************************************************");

        startTime = System.currentTimeMillis();
        deleteFromBegin(arrayList);
        endTimeArrayList = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        deleteFromBegin(linkedList);
        endTimeLinkedList = System.currentTimeMillis() - startTime;
        System.out.printf("Lead time of deleteFromBegin for ArrayList: %.3f s. \n Lead time of deleteFromBegin for LinkedList: %.3f s. \n ",
                (double) endTimeArrayList / 1000, (double) endTimeLinkedList / 1000);
        System.out.println("**********************************************************");

        startTime = System.currentTimeMillis();
        deleteFromMiddle(arrayList);
        endTimeArrayList = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        deleteFromMiddle(linkedList);
        endTimeLinkedList = System.currentTimeMillis() - startTime;
        System.out.printf("Lead time of deleteFromMiddle for ArrayList: %.3f s. \n Lead time of deleteFromMiddle for LinkedList: %.3f s. \n ",
                (double) endTimeArrayList / 1000, (double) endTimeLinkedList / 1000);
        System.out.println("**********************************************************");

        startTime = System.currentTimeMillis();
        deleteFromEnd(arrayList);
        endTimeArrayList = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        deleteFromEnd(linkedList);
        endTimeLinkedList = System.currentTimeMillis() - startTime;
        System.out.printf("Lead time of deleteFromEnd for ArrayList: %.3f s. \n Lead time of deleteFromEnd for LinkedList: %.3f s. \n ",
                (double) endTimeArrayList / 1000, (double) endTimeLinkedList / 1000);
        System.out.println("************************END*******************************");
    }

    static Integer getRandomNumber() {
        return (int) (Math.random() * (1000) + 1);
    }

    static void addToBegin(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.add(0, getRandomNumber());
        }
    }

    static void addToMiddle(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.add(list.size() / 2, getRandomNumber());
        }
    }

    static void addToEnd(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.add(getRandomNumber());
        }
    }

    static void deleteFromBegin(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.remove(0);
        }
    }

    static void deleteFromMiddle(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.remove(list.size() / 2);
        }
    }

    static void deleteFromEnd(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.remove(list.size() - 1);
        }
    }
}
