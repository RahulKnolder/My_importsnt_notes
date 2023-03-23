package Comparable_Comparator.comparator.Example_1;
/*
*
* In Java, a Comparator is an interface that allows you to define a custom ordering for a collection of objects.
* It is used to compare two objects and determine their relative order based on a specific criteria or set of criteria.
*
* */
public class ComparatorExample {
    private String firstName;
    private String lastName;
    private int salary;


    public ComparatorExample(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



}
