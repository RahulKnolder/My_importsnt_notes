package Comparable_Comparator.comparable.Example_2;

import Comparable_Comparator.comparable.Example_1.Student;

import java.util.ArrayList;
import java.util.Collections;

public class SortMYClass {
    public static void main(String[] args) {
        ArrayList<Kip> al = new ArrayList<Kip>();
        al.add(new Kip("Salil", 23, 23));
        al.add(new Kip("rahul", 56, 27));
        al.add(new Kip("riya", 25, 21));


        Collections.sort(al);

        for (Kip s:al) {
            System.out.println(s.id+" "+s.marks+" "+s.name);
        }

    }
}
