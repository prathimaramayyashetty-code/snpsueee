package Recursion;
public class Fibbonacci {
    public static void main(String[] args) {
        int n = 5; // Change this to get different number of terms
        int n1 = 0, n2= 1,sum =0;

        System.out.print(n1 + " "+n2+"  ");
        for (int i = 2; i < n; i++) {
            sum=n1+n2;
            System.out.print(sum+ "  ");
            n1=n2;
            n2=sum;
        }
    }
}