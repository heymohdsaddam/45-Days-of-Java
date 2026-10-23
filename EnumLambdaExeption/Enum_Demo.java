package EnumLambdaExeption;

enum Status {
    Running,Failed,Pending,Success
}
public class Enum_Demo {
    public static void main(String[] args) {
        Status s = Status.Pending;   // 0 1 2 3
        System.out.println(s);
        System.out.println(s.ordinal());
        Status[] ss = Status.values();
        for (Status st : ss) {
            System.out.println(st+ " : "+st.ordinal());
        }
        switch (s) {
            case Running:
                System.out.println("Good! Everthing is good . ");
                break;
        
            case Failed:
                System.out.println("Sorry! Try again . ");
                break;
        
            case Pending:
                System.out.println("Please wait !");
                break;
        
            default:
                System.out.println("Congratulation ! Good work .");
        }
    }
}
