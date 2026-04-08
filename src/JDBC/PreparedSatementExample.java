package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedSatementExample {
     public static void main(String[] args) {
         try{
             Connection con= DriverManager.getConnection(
                     "jdbc:mysql://localhost:3306/testdb",
                     "root",
                     "Prathima@2005"
             );
             String query="INSERT INTO students(id,name.age) VALUE(?,?,?)";

             PreparedStatement ps=con.prepareStatement(query);
             ps.setInt(1,102);
             ps.setString(2,"Anjali");
             ps.setInt(3,95);
             System.out.println("data inserted successfully");
             con.close();
         }catch (Exception e){
             System.out.println(e);
         }

    }
}
