package Comparable_Comparator.comparator.Example_1;

import java.util.Comparator;

public class ComparatorSalary implements Comparator<ComparatorExample> {

    @Override
    public int compare(ComparatorExample o1, ComparatorExample o2) {
       if(o1.getSalary()>o1.getSalary())
           return 1;
       else return 0;
    }
}
