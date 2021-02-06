package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.SQLException;
public class DBOOperations {
	public Connection getDBConnection(){
		Connection con=null;
		try {
			// load the jdbc driver-4 into application for mysql.
			Class.forName("com.mysql.jdbc.Driver");
			
			//establish the connection.
			// DriverManager.getConnection(connectionURL, username,password)
			
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
	
	public void closeDBConnection(Connection con){
		try
        {
            con.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}
	
	/*public int insertRows(ArrayList<student> list){
	
		int rows=0;
		try{
			Connection con=getDBConnection();
			//create insert query relevent to your application with ? instead of values 
			String query="insert into studentmarks values(?,?,?,?,?,?,?)";
			
			PreparedStatement psmt=con.prepareStatement(query);
			
			// Create object of Iterator from ArrayList and then iterate through
			
			Iterator<student> it=list.iterator();
			
			while(it.hasNext()){
				// Create POJO object from it.next
				student object=it.next();
				// call setXXX() methods to set the values with the values of POJO class members by calling its getter in place of each ?
				
				psmt.setString(1, object.getRegNo());
				psmt.setString(2, object.getQ1());
				psmt.setString(3, object.getQ2());
				psmt.setString(4, object.getQ3());
				psmt.setString(5, object.getQ4());
				psmt.setString(6, object.getQ5());
				psmt.setString(7, object.getQ6());
				rows=psmt.executeUpdate();
			}
	      closeDBConnection(con);
		}
		catch(Exception e){
			e.printStackTrace();
		}
				
		return rows;
     }*/
	
	// define selectqueryN () for each select query in the problem statement. 
	
	public void attainmentValue1()  {
		try {
		String query = "select avg(Q1) from studentmarks";
		Connection con=getDBConnection();
		PreparedStatement psmt  =con.prepareStatement(query);
		ResultSet rs=psmt.executeQuery();
		rs.next();
		float a = rs.getFloat(1);
		String q = "select count(Q1) from studentmarks where Q1 >= ?";
		PreparedStatement p  =con.prepareStatement(q);
		p.setFloat(1, a);
		ResultSet r = p.executeQuery();
		r.next();
		float c = r.getInt(1);
		String q1 = "select count(Q1) from studentmarks";
		PreparedStatement p1  =con.prepareStatement(q1);
		ResultSet r1 = p1.executeQuery();
		r1.next();
		int v = r1.getInt(1);
		float t = c/v;
		System.out.println("Attainment value for Question-1: " + t);
		closeDBConnection(con);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public void attainmentValue2()  {
		try {
		String query = "select avg(Q2) from studentmarks";
		Connection con=getDBConnection();
		PreparedStatement psmt  =con.prepareStatement(query);
		ResultSet rs=psmt.executeQuery();
		rs.next();
		float a = rs.getFloat(1);
		String q = "select count(Q2) from studentmarks where Q2 >= ?";
		PreparedStatement p  =con.prepareStatement(q);
		p.setFloat(1, a);
		ResultSet r = p.executeQuery();
		r.next();
		float c = r.getInt(1);
		String q1 = "select count(Q2) from studentmarks";
		PreparedStatement p1  =con.prepareStatement(q1);
		ResultSet r1 = p1.executeQuery();
		r1.next();
		int v = r1.getInt(1);
		float t = c/v;
		System.out.println("Attainment value for Question-2: " + t);
		closeDBConnection(con);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void attainmentValue3()  {
		try {
		String query = "select avg(Q3) from studentmarks";
		Connection con=getDBConnection();
		PreparedStatement psmt  =con.prepareStatement(query);
		ResultSet rs=psmt.executeQuery();
		rs.next();
		float a = rs.getFloat(1);
		String q = "select count(Q3) from studentmarks where Q3 >= ?";
		PreparedStatement p  =con.prepareStatement(q);
		p.setFloat(1, a);
		ResultSet r = p.executeQuery();
		r.next();
		float c = r.getInt(1);
		String q1 = "select count(Q3) from studentmarks";
		PreparedStatement p1  =con.prepareStatement(q1);
		ResultSet r1 = p1.executeQuery();
		r1.next();
		int v = r1.getInt(1);
		float t = c/v;
		System.out.println("Attainment value for Question-3: " + t);
		closeDBConnection(con);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void attainmentValue4()  {
		try {
		String query = "select avg(Q4) from studentmarks";
		Connection con=getDBConnection();
		PreparedStatement psmt  =con.prepareStatement(query);
		ResultSet rs=psmt.executeQuery();
		rs.next();
		float a = rs.getFloat(1);
		String q = "select count(Q4) from studentmarks where Q2 >= ?";
		PreparedStatement p  =con.prepareStatement(q);
		p.setFloat(1, a);
		ResultSet r = p.executeQuery();
		r.next();
		float c = r.getInt(1);
		String q1 = "select count(Q4) from studentmarks";
		PreparedStatement p1  =con.prepareStatement(q1);
		ResultSet r1 = p1.executeQuery();
		r1.next();
		int v = r1.getInt(1);
		float t = c/v;
		System.out.println("Attainment value for Question-4: " + t);
		closeDBConnection(con);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void attainmentValue5()  {
		try {
		String query = "select avg(Q5) from studentmarks";
		Connection con=getDBConnection();
		PreparedStatement psmt  =con.prepareStatement(query);
		ResultSet rs=psmt.executeQuery();
		rs.next();
		float a = rs.getFloat(1);
		String q = "select count(Q5) from studentmarks where Q2 >= ?";
		PreparedStatement p  =con.prepareStatement(q);
		p.setFloat(1, a);
		ResultSet r = p.executeQuery();
		r.next();
		float c = r.getInt(1);
		String q1 = "select count(Q5) from studentmarks";
		PreparedStatement p1  =con.prepareStatement(q1);
		ResultSet r1 = p1.executeQuery();
		r1.next();
		int v = r1.getInt(1);
		float t = c/v;
		System.out.println("Attainment value for Question-5: " + t);
		closeDBConnection(con);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void attainmentValue6()  {
		try {
		String query = "select avg(Q6) from studentmarks";
		Connection con=getDBConnection();
		PreparedStatement psmt  =con.prepareStatement(query);
		ResultSet rs=psmt.executeQuery();
		rs.next();
		float a = rs.getFloat(1);
		String q = "select count(Q6) from studentmarks where Q2 >= ?";
		PreparedStatement p  =con.prepareStatement(q);
		p.setFloat(1, a);
		ResultSet r = p.executeQuery();
		r.next();
		float c = r.getInt(1);
		String q1 = "select count(Q6) from studentmarks";
		PreparedStatement p1  =con.prepareStatement(q1);
		ResultSet r1 = p1.executeQuery();
		r1.next();
		int v = r1.getInt(1);
		float t = c/v;
		System.out.println("Attainment value for Question-6: " + t);
		closeDBConnection(con);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

