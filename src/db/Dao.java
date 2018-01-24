package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
	public static  ResultSet executeQuery(String sql) {
		// TODO Auto-generated method stub
	 Statement stmt;
	 Connection conn;
	 ResultSet rs = null;
			try{
				conn =DB.getConntion();
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				
			}catch(SQLException e){
				System.err.println("Data.executeQuery:"+e.getMessage());
			}
			return rs;
	}
}
