package oops.Inheritancesingle;

import javax.sound.midi.spi.SoundbankReader;

public class animal {
    void eat(){
        System.out.println("Eating..");
    }
}
class Dog extends animal{
    void bark(){
        System.out.println("Barking..");
    }

}
class Driver{
    public static void main(String[] args) {
        animal a= new animal();
        a.eat();
        Dog d=new Dog();
        d.bark();
        d.eat();

    }
}