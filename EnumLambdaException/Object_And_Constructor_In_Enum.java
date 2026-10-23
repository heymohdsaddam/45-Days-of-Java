package EnumLambdaException;

enum Laptop {
    Macbook(70000), Swift(60000), surface, Victas(55000);

    private int price;

    private Laptop() {
        price = 30000; // minimum price is 30000
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class Object_And_Constructor_In_Enum {
    public static void main(String[] args) {
        for (Laptop laptop : Laptop.values()) {
            System.out.println(laptop + " : " + laptop.getPrice());
        }
    }
}
