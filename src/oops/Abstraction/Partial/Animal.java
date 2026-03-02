package oops.Abstraction.Partial;
abstract class Animal{
    abstract void eat();
    void run(){
        System.out.println("Running...");
    }
}
class Lion extends Animal{
    void eat(){
        System.out.println("meat");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Grass");
    }
}
class Driver{
    public static void main(String[] args) {
        Lion l=new Lion();
        Deer d=new Deer();
        l.eat();
        d.eat();
        l.run();
    }
}