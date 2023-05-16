package JDBCOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlSelectCommand {

	public static void main(String[] args) throws SQLException {
		
		//1.Create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wiprotable", "root","reema@123");
		
		
	// 2.Create Statement/Query
		Statement stamt = con.createStatement();
		String s =("Select book_no, title,sub_code,author from book_det1");
		
		//3. Execute Statement/Query 
		//4.Store data in Result set
		
		ResultSet rs = stamt.executeQuery(s);
		while (rs.next()) {
			String bid = rs.getString("book_no");
			String tit = rs.getString("title");
			String scode = rs.getString("Sub_code");
			String aut = rs.getString("author");
			
			System.out.println(bid + " " +tit + " "+ scode + " " + aut);
		}
		
		// s.close connection
		
		con.close();
		System.out.println("Statement executed : Query executed ..........");
		
		} 
		
		
		

	}


