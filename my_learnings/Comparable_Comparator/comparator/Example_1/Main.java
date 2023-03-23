package Comparable_Comparator.comparator.Example_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ComparatorExample> list = new ArrayList<>();

        list.add(new ComparatorExample("rahul","sinha",23));
        list.add(new ComparatorExample("Rishika","kumari",2399));
        list.add(new ComparatorExample("Salil","kumar",900));

        Collections.sort(list,new ComparatorSalary());

        for (ComparatorExample c: list) {
            System.out.println(c.getFirstName()+" "+c.getSalary()+" "+c.getFirstName()+" "+c.getLastName());

        }
    }
    }
