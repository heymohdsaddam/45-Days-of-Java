package VarSealedRecord;
// class var {

// }  this gives the error
class ABC_Class {
    void show() {
        System.out.println("OO LALA OO LALA");
    }
}

public class VarKeyword {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(n);

        int var = 10;
        System.out.println(var);

        // var a; this alone gives the error
        // a = 9; first declaration then after intializing it also give the error
        // because
        // for the var keyword it must be initialized
        var a = 45;

        var obj = new ABC_Class(); // var keyword can hold the reference of object reference
        obj.show();

        System.out.println(a);
    }
}
