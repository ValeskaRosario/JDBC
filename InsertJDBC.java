import java.sql.*;
class InsertJDBC{
public static void main (String args[]){

	try{
	
	Class.forName("com.mysql.cj.jdbc.Driver");

	String url="jdbc:mysql://localhost:3306/youtube";
	String username ="root";
	String password ="$Leaval10";

	Connection con=DriverManager.getConnection(url,username,password);

//Create a query

	String q="create table table(tId int (20) primary key auto_increment,tName varchar (200) not null ,tCity varchar(300))";


//create a statement 
	Statement stmt = con.createStatement();
	stmt.executeUpdate(q);
	System.out.println("table created in database..");

	con.close();



	}
	catch(Exception e){
		e.printStackTrace();
		}

}
}