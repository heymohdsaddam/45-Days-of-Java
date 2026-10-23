interface  Computer {
    public void show();
}
class Laptop implements Computer {
    public void show() {
        System.out.println("Laptop is thin and faster ~ !!");
    }
}
class Desktop implements Computer {
    public void show(){
        System.out.println("Desktop can do heavy task easily");
    }
}
class Developer {
    void what_Dev_Got(Computer sys){
        sys.show();
    }
}
public class Need_Of_Interfec {

    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        Developer developer = new Developer();
        System.out.println("------ What is Laptop : ");
        developer.what_Dev_Got(laptop);
        System.out.println("------ What is Desktop : ");
        developer.what_Dev_Got(desktop);

    }
}