import java.sql.*;

public class LoginDao {

public static boolean validate(String UserName,String Passward){
boolean status=false;
String ss="jdbc:mysql://localhost:3306/Users";
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(ss,"root","2133");
	
	PreparedStatement ps=con.prepareStatement("select * from users where UserName=? and Passward=?");
	ps.setString(1,UserName);
	ps.setString(2,Passward);
	
	ResultSet rs=ps.executeQuery();
	status=rs.next();
	
	
}catch(Exception e){System.out.println(e);}
return status;
}
}
