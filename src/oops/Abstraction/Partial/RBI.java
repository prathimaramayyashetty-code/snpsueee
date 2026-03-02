package oops.Abstraction.Partial;

abstract class RBI {
    abstract int ROI();
}
class HDFC extends RBI{
    int ROI(){
        return 10;
    }
}
class SBI extends RBI{
    int ROI(){
        return 6;
    }
}
class Driver1{
    public static void main(String[] args) {
        HDFC h = new HDFC();
        SBI s = new SBI();
        System.out.println("HDFC "+h.ROI());
        System.out.println( "SBI "+s.ROI());
    }
}