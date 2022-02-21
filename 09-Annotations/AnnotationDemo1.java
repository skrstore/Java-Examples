import java.lang.annotation.Inherited;

class AnnotationDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.helloA();

        B b = new B();
        b.helloA();
        b.showOld();
    }
}

// :::::: show error because it is containing two methods :::::::
// 1
// @FunctionalInterface
// interface test{
// void showA();
// void showB();
// }

class A {
    void helloA() {
        System.out.println("inside A");
    }
}

class B extends A {
    // 2
    @Override
    void helloA() {
        System.out.println("inside B");
    }

    // 3
    @Deprecated
    void showOld() {
        System.out.println("This is Depreated");
    }
}

// 4
// @SuppressWarnings("unchecked")

// 5
// @Inherited
