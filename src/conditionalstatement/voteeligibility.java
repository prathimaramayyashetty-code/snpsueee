package conditionalstatement;

import java.util.Scanner;

public class voteeligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int n=sc.nextInt();
        if (n>=18){
            System.out.println("eligible to vote");
        }else{
            System.out.println("not eligible");
        }
    }
}
