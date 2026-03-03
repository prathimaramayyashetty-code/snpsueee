package StringBufferandBuilder;

public class StringBuilderExample {
        static void stringAppend(){
            StringBuilder  sbf=new StringBuilder ("Hello");
            System.out.println("Original String is:"+sbf);
            sbf.append("World");
            System.out.println("new String is:"+sbf);
        }
        static void Stringinsert(){
            StringBuilder  sbf=new StringBuilder ("Hello");
            System.out.println("Original String is:"+sbf);
            sbf.insert(2,"World");
            System.out.println("new String is:"+sbf);
        }
        static void Stringreverse(){
        StringBuilder sbf=new StringBuilder("Hello");
        System.out.println("Original String is:"+sbf);
        sbf.reverse();
        System.out.println("new String is:"+sbf);
    }
        public static void main(String[] args) {
            stringAppend();
            Stringinsert();
            Stringreverse();
        }
    }

