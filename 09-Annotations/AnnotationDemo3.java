import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// :::::::::::::::::::::::::::::::::
// Reading the values from the annotation using the ::: Annotation ::: 

// Meta Annotation
// @Target specify the level of the usage
// @Retentation specify the time to where we want the Annotations 
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Mobile {
    String os();

    int version();
}

@Mobile(os = "Android", version = 8)
class Samsung {
    String model;
    int size;

    Samsung(String model, int size) {
        this.model = model;
        this.size = size;
    }
}

class AnnotationDemo3 {
    public static void main(String[] args) {
        Samsung s1 = new Samsung("Galaxy", 5);
        System.out.println(s1.model);

        Class c = s1.getClass();
        Annotation an = c.getAnnotation(Mobile.class);
        Mobile m = (Mobile) an;
        System.out.println(m.os());
    }
}