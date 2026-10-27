package ThreadingCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting_Collection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(56);
        list.add(49);
        list.add(65);
        list.add(58);
        list.add(34);
        list.add(68);
        list.add(39);
        Comparator<Integer> com_Number = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (a % 10 > b % 10) {
                    return 1;
                } else if (a % 10 == b % 10) {
                    return a > b ? 1 : -1; // if last digit is the same then small number will first come
                } else {
                    return -1;
                }
            }
        };
        System.out.println("Before Sorting : ");
        System.out.println(list);
        Collections.sort(list, com_Number);
        System.out.println("After Sorting : ");
        System.out.println(list);

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Mohd Saddam", 34));
        students.add(new Student("Rehan Jaffery", 42));
        students.add(new Student("Zaki Nafees", 58));
        students.add(new Student("Kaleem", 25));
        students.add(new Student("Mujtaba", 28));
        Comparator<Student> com_Student = new Comparator<Student>() {
            public int compare(Student a, Student b) {
                if (a.getRoll_No() > b.getRoll_No()) {
                    return 1;
                } else if (a.getRoll_No() < b.getRoll_No()) {
                    return -1;
                } else {
                    return (a.getName().charAt(0) > b.getName().charAt(0)) ? 1 : -1;
                }
            }
        };
        System.out.println("Before Sorting Objects : ");
        for (Student student : students) {
            System.out.println(student);
        }
        Collections.sort(students, com_Student);
        // Collections.sort(students);

        System.out.println("After Sorting Objects : ");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int roll_No;

    public Student(String name, int roll_No) {
        this.name = name;
        this.roll_No = roll_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_No() {
        return roll_No;
    }

    public void setRoll_No(int roll_No) {
        this.roll_No = roll_No;
    }

    public String toString() {
        return name + " : " + roll_No;
    }

    public int compareTo(Student that) {
        if (this.getRoll_No() > that.getRoll_No()) {
            return 1;
        } else if (this.getRoll_No() < that.getRoll_No()) {
            return -1;
        } else {
            return (this.getName().charAt(0) > that.getName().charAt(0)) ? 1 : -1;
        }
    }
}
