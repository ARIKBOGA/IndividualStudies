
public class Calisan {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
        System.out.println(a.getName());
    }
}

class A {
    private final String name = "Aaaaa";

    void m1() {
        System.out.println("A");
    }

    protected String getName() {
        return this.name;
    }
}

class B extends A {
    String name = "Bbbbb";

    protected void m1() {
        System.out.println("B");
    }
}