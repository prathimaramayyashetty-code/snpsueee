package ExceptionHandling;

public class E3A {
    public static void main(String[] args) {
        int age=19;
        if (age>=18){
            System.out.println("access granted");
        }else{
            throw new RuntimeException("access Denied");
        }

    }
}
