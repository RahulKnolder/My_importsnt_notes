package LambdaConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample_Map {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


        list.add(560);
        list.add(23);
        list.add(89);
        list.add(56);
        list.add(589);



        List<Integer> list2 = list.stream().map( intotwo ->intotwo*2).collect(Collectors.toList());
        List<Integer> list3 = list.stream().map( intotwo ->intotwo*2).collect(Collectors.toList());

        for (Integer values:list2) {
            System.out.println(values);
        }

    }
}
