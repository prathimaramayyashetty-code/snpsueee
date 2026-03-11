package WrapperClasses;

public class Wrapperdemo1 {
    public static void main(String[] args) {
        int x=10;
        Integer obj=new Integer(x);//manual boxing
        System.out.println("Primitive value:"+x);
        System.out.println("Object value:"+obj);
    }
}
