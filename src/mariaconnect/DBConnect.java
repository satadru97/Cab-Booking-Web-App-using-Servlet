package mariaconnect;
import java.sql.*;
public class DBConnect {
	static Connection cn=null;
	static String driver="com.ibm.db2.jcc.DB2Driver";
	static String url="jdbc:db2://localhost:50000/cloud";
	static String user="YOUR_USER_NAME";
	static String pass="YOUR_PASSWORD";
	
	public static Connection getCn(){
		
		try{
			Class.forName(driver);
			cn = DriverManager.getConnection(url,user,pass);
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		return cn;
	}

}
