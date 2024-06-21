import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static java.sql.DriverManager.getConnection;

public class UpdateJDBC {

    public static void main(String[] args) {
        try{

         Class.forName("com.mysql.cj.jdbc.Driver");
         String url="jdbc:mysql://localhost:3306/youtube";
String username="root";
String password ="$Leaval10";

Connection con =DriverManager.getConnection(url,username,password);
         //   Connection con = ConnectionProvider.getConnection();
            String q = "Update table set tName=? ,tcity =? where tId=?";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter new name");
            String name = br.readLine();

            System.out.println("Enter new city name");
            String city = br.readLine();

            System.out.println(" Enter the student id");
            int id = Integer.parseInt(br.readLine());

            PreparedStatement pstmt =con.prepareStatement(q);

            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.setString(3,id+"");
            pstmt.executeUpdate();

            System.out.println("done....");
            con.close();
        }

        catch(Exception e){
            System.out.println(e);
        }
    }
}
