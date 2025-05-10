package Site;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SiteCtrl {

	//Connect DB
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	//Insert data function
	public static boolean insertdata (String user_name , String email , String password_hash ) {
		
		boolean isSuccess = false;
		try {
			//DB Connection call
			con=DB_Connection.getConnection();
			stmt=con.createStatement();
			
			//SQL Query
			String sql = "insert into developers ( user_name ,  email ,  password_hash )  values('" + user_name + "','" + email + "','" + password_hash + "')";
			int rs = stmt.executeUpdate(sql);
			if(rs>0) {
				isSuccess = true ;
			}
			else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	//GetById
	public static List<siteModel> getByID (String id){
		
		int convertedID = Integer.parseInt(id);
		
		ArrayList <siteModel> user = new ArrayList<>();
		
		try {
			//DB Connection call
			con=DB_Connection.getConnection();
			stmt=con.createStatement();
			
			//SQL Query
			String sql = "select * from developers where user_id '"+convertedID+"'";
			
			 rs = stmt.executeQuery(sql);
			 
			 while(rs.next()) {
				 int user_id = rs.getInt(1);
				 String user_name = rs.getString(2);
				 String email = rs.getString(3);
				 String password_hash = rs.getString(4);
				 String created_date = rs.getString(5);
				 
				 siteModel sm = new siteModel (user_id, user_name, email,password_hash, created_date);
				 user.add(sm);
			 }
			 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return user ;
	}
	
	//GetAll Data
	public static List<siteModel> getAllUsers(){
		
		ArrayList <siteModel> users = new ArrayList<>();
		
		try {
			//DB Connection call
			con=DB_Connection.getConnection();
			stmt=con.createStatement();
			
			//SQL Query
			String sql = "select * from developers" ;
			
			 rs = stmt.executeQuery(sql);
			 
			 while(rs.next()) {
				 int user_id = rs.getInt(1);
				 String user_name = rs.getString(2);
				 String email = rs.getString(3);
				 String password_hash = rs.getString(4);
				 String created_date = rs.getString(5);
				 
				 siteModel sm = new siteModel (user_id, user_name, email,password_hash,created_date);
				 users.add(sm);
			 }
			 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return users ;	
	}
	
	//Update Data
	public static boolean updatedata(String user_id ,String user_name,String email,String password_hash,String created_date) {
		
		try {
			//DB Connection call
			con=DB_Connection.getConnection();
			stmt=con.createStatement();
			
			//SQL Query
			String sql ="update developers set user_name ='"+user_name+"',email ='"+email+"',password_hash ='"+password_hash+"',created_date ='"+created_date+"'  "
					+"where user_id = '"+user_id+"' ";
			
			int rs = stmt.executeUpdate(sql);
			if(rs>0) {
				isSuccess = true ;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess ;	
	}

	public static void updatedata(int user_id, String user_name, String email, String password_hash) {
		try {
			//DB Connection call
			con=DB_Connection.getConnection();
			stmt=con.createStatement();
			
			//SQL Query
			String sql ="update developers set user_name ='"+user_name+"',email ='"+email+"',password_hash ='"+password_hash+"' "
					+"where user_id = '"+user_id+"' ";
			
			int rs = stmt.executeUpdate(sql);
			if(rs>0) {
				isSuccess = true ;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}	
}
