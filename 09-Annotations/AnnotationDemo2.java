// Types of the Annotations

// ::::: No member
@interface Mobile {

}

// ::::: Single member
@interface SingleValueA{
    String os();
}

// ::::: Multi member 
@interface MultiValueA{
    String os();
    int version();
}

// ::::: member with defalut values
@interface DefaultA{
    String os() default "Andrid";
    int version() default 7;
}

@Mobile
class AnnotationDemo2 {
    public static void main(String[] args) {
        SingleValueDemo svd = new SingleValueDemo();
        svd.showD();
        MultiValuedDemo mvd = new MultiValuedDemo();
        mvd.showD();
        DefaultDemo dd = new DefaultDemo();
        dd.showD();
    }
}

@SingleValueA(os = "iOS")
class SingleValueDemo{  
    void showD(){
        System.out.println("This is Single valued Anotation Demo");
    }
}

@MultiValueA(os = "Android", version = 8)
class MultiValuedDemo{
    void showD(){
        System.out.println("This is multi-valued Annotation Demo");
    }
}

@DefaultA
class DefaultDemo{
    void showD(){
        System.out.println("This is Default Annotation Deno");
    }
}