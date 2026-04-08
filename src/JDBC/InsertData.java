package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {
        try{
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "Prathima@2005"
            );
            String query="INSERT INTO students(id,name,age) VALUES (102,'Anjali',22)";
            Statement stmt=con.createStatement();
            int rows=stmt.executeUpdate(query);
            System.out.println(rows+"row Inserted!");
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
