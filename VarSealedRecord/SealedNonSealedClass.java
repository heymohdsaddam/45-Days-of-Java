package VarSealedRecord;

sealed class A permits B, C {
    void show_A() {
        System.out.println("In A");
    }
}

final class B extends A { // we can use final,sealed, non-sealed before the class keyword
    void show_B() {
        System.out.println("In B");
    }
}

final class C extends A {
    void show_C() {
        System.out.println("In C");
    }
}

sealed interface XYZ permits YZ, Z {
    void show_XYZ();
}

non-sealed interface YZ extends XYZ { // we can not use final to any interface we can use sealed with permits or
                                      // non-sealed
    void show_YZ();
}

non-sealed interface Z extends XYZ { // we can not use final to any interface we can use sealed with permits or
                                     // non-sealed
    void show_Z();
}

public class SealedNonSealedClass {
    public static void main(String[] args) {
        C c = new C();
        c.show_A();
        c.show_C();
    }
}
