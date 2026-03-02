package oops.hierarchical;

public class animal {
    void eat(){
        System.out.println("Eating..");
    }
}
class Dog extends animal {
    void bark(){
        System.out.println("Barking..");
    }

}
class Cat extends  animal {
    void meow(){
        System.out.println("meowing...");
    }}

class Driver{
    public static void main(String[] args) {
        animal a= new animal();
        a.eat();
        Dog d=new Dog();
        d.bark();
        d.eat();
        Cat c=new Cat();
        c.meow();
        c.eat();
    }
}
