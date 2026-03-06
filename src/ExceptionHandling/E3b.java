package ExceptionHandling;

public class E3b {
    public static void main(String[] args) {
        try{
            int balance=2000;
            int withdraw=3000;
            if(withdraw>balance){
                throw new ArithmeticException("Insufficient Balance");
            }
            System.out.println("Withdraw successfull");
        }catch(ArithmeticException e){
            System.out.println("Exception caught:"+e.getMessage());
        }
    }
}
