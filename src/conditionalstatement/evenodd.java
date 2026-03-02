package conditionalstatement;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check");
        int n =sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}
