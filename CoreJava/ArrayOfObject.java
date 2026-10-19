class ArrayOfObject {
    public static void main(String[] args) {
        Student s1 = new Student(34, 97, "Mohd Saddam");
        Student s2 = new Student(42, 95, "Rehan Jaffery");
        Student s3 = new Student(58, 94, "Zaki Nafees");
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for (Student student : students) {
            System.out.println(student);
        }

    }
}

class Student {
    private int roll_No;
    private int marks;
    private String name;

    public Student(int roll_No, int marks, String name) {
        this.roll_No = roll_No;
        this.marks = roll_No;
        this.name = name;
    }

    public String toString() {
        return "Roll_no : " + roll_No + "\nMarks : " + marks + "\nname : " + name + "\n ----------------------";
    }

}
