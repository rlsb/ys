package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DB {
 /**
  * @param args
  */
 private static String url="jdbc:mysql://localhost:3306/rg";
 private static String name="root";
 private static String password="123456";

 public static Connection getConntion() {
		try{
			//加载驱动程序；
			   Class.forName("com.mysql.jdbc.Driver");
			Connection conn;
			  //获得数据库连接；
			   conn=DriverManager.getConnection(url,name,password);
			return conn;
		}catch (ClassNotFoundException e){
		   e.printStackTrace();
		   return null;
		}
		catch (SQLException e){
			   e.printStackTrace();
			   return null;
			}
	}
	
	public static void closeConn(Connection con, PreparedStatement pstm,
			ResultSet rs){
		try{
			if(rs != null){
				rs.close();
				rs=null;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (pstm != null) {
				pstm.close();
				pstm = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (con != null)
			con.close();
			con = null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}