package jdbc;

/* Creating Stored procedures in sql
 * 
 * DELIMITER //
 * CREATE PROCEDURE getAllData()
 * BEGIN
 * SELECT * FROM employee
 * END//
 * DELIMITER
 */

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Callable {
	public static void main(String ...args) {
		Connection con;
		CallableStatement call;
		ResultSet res;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practiceDb","root","root");
			call = con.prepareCall("{call.getAllData()}");
			
			res = call.executeQuery();
			
			while(res.next()) {
				System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getInt(3));
			}
		}catch(ClassNotFoundException | SQLException ep) {
			System.out.println("Something went wrong load jar file properly and try again ");
		}
	}
}
