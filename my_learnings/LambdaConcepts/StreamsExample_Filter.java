package LambdaConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample_Filter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


        list.add(560);
        list.add(23);
        list.add(89);
        list.add(56);



        List<Integer> list2 = list.stream().filter(even -> even%2==0).collect(Collectors.toList());
        for (Integer I:list2) {
            System.out.println(I);
        }

    }
}
