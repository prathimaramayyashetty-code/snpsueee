package oops.encapsulation;

public class Student {
    private String name;
    private int usn;
    static String college;
    Student(String name,int usn){
        this.name=name;
        this.usn=usn;
        college="Sapthagiri";
    }
//Getter() -->Name(Private)
String getName(){
        return name;
}
//Getter() -->usn(Private)
    int getUsn(){
        return usn;
    }
    //Setter() -->Name(Private)
    void setName(String name){
        this.name=name;
    }
    //Setter() -->USn(Private)
    void setUsn(int usn){
        this.usn=usn;
    }
    void printDetails(){
        System.out.println("Student name is " + name);
        System.out.println("Student usn is " + usn);
        System.out.println("Student college is " + college);
    }
}
class Driver{
    public static void main(String[] args) {
        Student s1=new Student("Ashank",123);
        Student s2=new Student("devid",890);
        s1.printDetails();
        s2.printDetails();

    }
}
