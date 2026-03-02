package conditionalstatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class employeesalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your salary:");
        double sal=sc.nextDouble();
        double tax;
        double netSalary;

        if(sal<300000){
            tax=0;
        }else{
            if(sal<700000){
                tax=sal*0.10;
            }else{
                tax=sal*0.20;
            }
        }
        netSalary=sal-tax;
        System.out.println("Tax amount"+tax);
        System.out.println("Net Salary"+netSalary);

    }
}
