package JDBCOperation;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlDMLCommand {

	public static void main(String[] args) throws SQLException {
		// 1.create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wiprotable", "root","reema@123");
		
		//2.create Statement/query
		
		Statement stmt=con.createStatement();
		Statement stamt = con.createStatement();
		String s = ("INSERT INTO book_det1 values('PH003','CHE','REEMA','ABC','S','2023',800.0000");
		//String s ="UPDATE Student SET NAME = 'kim Smith' WHERE ID =1";
		//String s = "Delete From Student Where ID = 2";
		
		//3.Execute Statement /Query
		stamt.execute(s);
		
		//4.Close Connection
		con.close();
		System.out.println("Statement Executed:Inserted value Successfully");
		
		
		
		

	}

}
