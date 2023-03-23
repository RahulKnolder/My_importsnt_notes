package Comparable_Comparator.comparable.Example_2;

public class Kip implements Comparable <Kip>{
    String name ;
    int id;
    int marks ;

    public Kip(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }


    @Override
    public int compareTo(Kip o) {
        if(o.marks==marks)
            return 0;
        else if (o.marks>marks) {
            return 0;
        }
        else {
            return -1;
        }

    }
}
