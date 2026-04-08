package FileHandling;
import java.io.File;
import java.util.Scanner;


public class ReadFileExample {
    public  static void main(String[] args) {
        try{
            //step1 open the file
            File file=new File("student.txt");

             //step2 read the file
            Scanner sc=new Scanner(file);

            //step3
            while (sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            //step 4
            sc.close();

        }catch (Exception e){
            System.out.println("error while reading");

        }

    }

}
