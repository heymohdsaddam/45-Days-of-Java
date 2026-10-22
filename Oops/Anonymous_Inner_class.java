abstract class Anyms {
    abstract void show_Anyms();
}

public class Anonymous_Inner_class {

    public static void main(String[] args) {
        Anyms obj_Anyms = new Anyms()
        {
            public void show_Anyms(){
                System.out.println(" This is Anonymous Class");
            }
        };
        obj_Anyms.show_Anyms();
    }
}