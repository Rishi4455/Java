import java.sql.*; 
public class DBConnection { 
    public static void main(String[] args) { 
        try { 
            Connection con = 
            DriverManager.getConnection( 
            "jdbc:mysql://localhost:3306/test", 
            "root", 
            "root"); 
            System.out.println("Database Connected"); 
 con.close(); 
      } 
        catch(Exception e) { 
            System.out.println(e); 
        } 
        System.out.println("Name: Rishi Mandloi "); 
        System.out.println("Enrollment:0873CS241133 "); 
    } 
} 