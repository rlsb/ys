package diaocha;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import db.DB;
import db.Dao;
import model.information;


public class xianshi {
  public xianshi(){
	  
  }
  public  String rt(String list) {
		// TODO Auto-generated method stub
    Connection conn = null;
	PreparedStatement pstm = null;
  	String result="";
  	String daxiezimu=inputUppLowChar(list);
  	information user=null;
	String sql="select * from information ";
	ResultSet rs=(ResultSet) Dao.executeQuery(sql);
	try{		
		while(rs.next())
		{
			if((rs.getString("number").trim().compareTo(daxiezimu)==0))
					{
			user=new information();
			user.setNumber(rs.getString(1));
			user.setResult(rs.getString(2));
			}
		}
		rs.close();
	}catch(SQLException e){
		
		e.printStackTrace();
	}
	DB.closeConn(conn, pstm, rs);

		return user.getResult().toString();
	}
  public  String inputUppLowChar(String str) {
	    StringBuffer upperCase = new StringBuffer();
	    StringBuffer lowerCase = new StringBuffer();
	    for (int i = 0; i < str.length(); i++) {
	        char chr = str.charAt(i);
	        if (Character.isUpperCase(chr))
	            upperCase.append(chr);
	        else
	            lowerCase.append(chr);
	    }
	    System.out.println(upperCase.toString());
	    System.out.println(lowerCase.toString());
		return upperCase.toString();
	}
}
