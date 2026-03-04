package Garbagecollection;

public class EligibilityDemo {
    public void finalize(){
        System.out.println("Garbage Collected");
    }
    public static void main(String[] args){
        for(int i=0;i<1000;i++){
            EligibilityDemo obj= new EligibilityDemo();
            obj=null;
        }
        System.gc();
    }
}
