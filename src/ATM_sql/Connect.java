
package ATM_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect 
{
	public static Connection connect () {
		
	
	try {
	    Class.forName("org.postgresql.Driver").newInstance();
	    } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
	    System.err.println("Can’t load driver. Verify CLASSPATH");
	    System.err.println(e.getMessage());
	

	    }
	
	Connection conn = null;
	DriverManager.setLoginTimeout(60);  
	try {
	        String url = new StringBuilder()
	                .append("jdbc:")
	                .append("mysql")       // “mysql” / “db2” / “mssql” / “oracle” / ...
	                .append("://")
	                .append("127.0.0.1")
	                .append(":")
	                .append("3306")
	                .append("/")
	                .append("ATM")
	                .append("?user=")
	                .append("root")
	                .append("&password=")
	                .append("password").toString();
	        return DriverManager.getConnection(url);
	} catch (SQLException e1) {
	        System.err.println("Cannot connect to the database: " + e1.getMessage());
	}
	return conn;

}}

