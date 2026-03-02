package oops.PolymorphismRuntime;

 class Mom {
     void cook(){
         System.out.println("Indian");
     }
}
class Daughter{
     void cook(){
         System.out.println("Chinese");
     }
}
class Drive{
    public static void main(String[] args) {
        Mom m=new Mom();
        Daughter d= new Daughter();
        m.cook();
        d.cook();
    }
}
