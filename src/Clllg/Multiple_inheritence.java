package Clllg;

public class Multiple_inheritence {
    public static void main(String[] args) {
    C obj =new C();
    obj.showA();
    obj.showB();
    }
}

interface A{
    void showA();
}

interface B{
    void showB();
}

class C implements A,B{
    @Override
    public void showA() {
        System.out.println("This is interface of A");
    }

    @Override
    public void showB() {
        System.out.println("This is interface of B");
    }
}
