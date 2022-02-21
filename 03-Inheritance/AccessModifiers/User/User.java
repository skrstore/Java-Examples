package User;

public class User{
    private int a = 10; // Can not be accessed outside of this class 

    public int b = 12; // can be accessed from any where 

    protected int c = 123; //can only be accessed anywhere but through inheritance 
    
    int d = 1234; // default can be accessed in the same package

    void showV(){
        System.out.println("Value of a : " + a + "b : " + b + " c " + c + " d " + d);
    }
}