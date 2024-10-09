package ua.com.kisit_course.groupe372.unit3;

import java.util.Comparator;
import java.util.TreeSet;

public class MyTree {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.naturalOrder());
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(1);

        System.out.println(treeSet);

        TreeSet<Integer> treeSet2 = new TreeSet<>(Comparator.reverseOrder());
        treeSet2.add(6);
        treeSet2.add(8);
        treeSet2.add(7);
        treeSet2.add(9);
        treeSet2.add(10);
        treeSet2.add(1);
        System.out.println(treeSet2);

        //

    }
}
