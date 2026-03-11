package Recursion;

public class SumofNnaturalrec {
   static int sum(int x){
         if(x==1){//base case
             return 1;//exit point
         }else{
             return x+sum(x-1);///recursive case
         }
    }

    public static void main(String[] args) {

        int num=1000;
        sum(num);
        int result=sum(num);
        System.out.println(result);
    }
}
