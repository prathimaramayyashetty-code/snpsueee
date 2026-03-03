package StringBufferandBuilder;

public class StringBufferExample {
    static void stringAppend(){
        StringBuffer sbf=new StringBuffer("Hello");
        System.out.println("Original String is:"+sbf);
        sbf.append("World");
        System.out.println("new String is:"+sbf);
    }
    static void Stringinsert(){
        StringBuffer sbf=new StringBuffer("Hello");
        System.out.println("Original String is:"+sbf);
        sbf.insert(2,"World");
        System.out.println("new String is:"+sbf);
    }

    public static void main(String[] args) {
        stringAppend();
        Stringinsert();

    }
}
