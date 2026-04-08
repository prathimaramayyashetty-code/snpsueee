package FileHandling;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args){
        try{
            FileWriter writer=new FileWriter("student.txt");
            writer.write("Hello Students\nWelcome to the Class");
            writer.close();
            System.out.println("file written successfully!");

        }catch(IOException e){
            System.out.println("Error occured");
        }

    }

}
