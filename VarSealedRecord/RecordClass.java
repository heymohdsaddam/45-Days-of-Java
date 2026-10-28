package VarSealedRecord;

class Student {
    private int roll_No;
    private String name;

    public Student(int roll_No, String name) {
        this.roll_No = roll_No;
        this.name = name;
    }

    public int getRoll_No() {
        return roll_No;
    }

    public void setRoll_No(int roll_No) {
        this.roll_No = roll_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + roll_No;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (roll_No != other.roll_No)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [roll_No=" + roll_No + ", name=" + name + "]";
    }

}

// here it takes 60 line to store name and roll_No into a class but we can do
// same using record class
record record_Student(int roll_No, String name) { // we can not extends any class because it already extends the record
                                                  // class but we can implement an interface
    static int someVar = 5; // we can create a static instance but we can't create a local instance here
                            // like static
    // int num = 0; this will give the error
    // suppose here i want to ensure that no one enter the invalid roll number or
    // invalid name
    // public record_Student(int roll_No, String name) {
    // if (roll_No < 0 || roll_No == 0 || name.equals("")) {
    // throw new IllegalArgumentException();
    // }
    // this.roll_No = roll_No;
    // this.name = name;
    // } we can shrink the size of the below using COMPACT CANONICAL CONSTRUCTOR

    public record_Student {
        if (roll_No < 0 || roll_No == 0 || name.equals("")) {
            throw new IllegalArgumentException("It can't be Zero");
        }
    }

}

public class RecordClass {
    public static void main(String[] args) {
        Student st1 = new Student(1, "Mohd Saddam");
        Student st2 = new Student(1, "Mohd Saddam");
        System.out.println(st1.equals(st2));

        record_Student st3 = new record_Student(1, "Mohd Saddam");
        record_Student st4 = new record_Student(1, "Mohd Saddam");
        System.out.println(st3.equals(st4));

        // we can access using object.instanceName()
        System.out.println(st3.roll_No() + " " + st3.name());

        try {
            record_Student st5 = new record_Student(0, "Ms");
            System.out.println(st5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
