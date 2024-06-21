//prepared statement ....when the query has some parameter/dynamic queries
//insert into table value(?,?)

import java.sql.*;
class Fun{
public static void main (String args[] ){
try{

Class.forName("com.mysql.cj.jdbc.Driver");

String url="jdbc:mysql://localhost:3306/youtube";
String username="root";
String password ="$Leaval10";

Connection con =DriverManager.getConnection(url,username,password);

//create a query
String 	q = "insert into table1( tName,tCity) values (?,?)";

//get the PreparedStatement object 
PreparedStatement pstmt= con.prepareStatement(q);

//set the values to the query
pstmt.setString (1,"Leandra Rosario");
pstmt.setString (2,"Delhi");

pstmt.executeUpdate();

System.out.println("Inserted"); 

con.close();
}
catch(Exception e){
System.out.println(e);
}

}
}