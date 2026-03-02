package conditionalstatement;
import java.util.Scanner;
public class positive_negative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check");
        int n=sc.nextInt();
        if (n>0){
            System.out.println("number is positive");}
        else{
            System.out.println("number is negative");
        }

    }
}
