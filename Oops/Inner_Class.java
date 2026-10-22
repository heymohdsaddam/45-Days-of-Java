

public class Inner_Class {
    public static void main(String[] args) {
       Apple obj_Apple = new Apple();
       obj_Apple.show_Apple();
       Apple.Banana obj_Banana = obj_Apple.new Banana();
       obj_Banana.show_Banana();  
    }
}
class Apple {
    public void show_Apple(){
        System.out.println("In Apple");
    }
    class Banana {
        public void show_Banana(){
            System.out.println("In Banana");
        }
    }
}