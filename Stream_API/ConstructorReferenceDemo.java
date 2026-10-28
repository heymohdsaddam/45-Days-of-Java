package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mohd Saddam", "Motsim", "Tanveer", "Sameer", "Samar", "Neon");

        List<Student> students = new ArrayList<>();

        // for (String name : names) {
        // students.add(new Student(name));
        // }
        // above and below line are the same as it works the same
        students = names.stream().map(Student::new).toList();

        students.forEach(System.out::println);

    }
}

class Student {
    String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
