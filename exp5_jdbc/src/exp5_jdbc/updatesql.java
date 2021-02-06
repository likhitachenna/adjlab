package exp5_jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class updatesql {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
		//load the jdbc driver-4 into application for mysql.
		Class.forName("com.mysql.jdbc.Driver");

		//establish the connection.
		//DriverManager.getConnection(connecctionURL,username,password)

		con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employe","root","");
		
		
		//UPDATE QUERY
		String query="update emp set name=? where job=?";
		
		PreparedStatement upsmt=(PreparedStatement) con.prepareStatement(query);

		upsmt.setString(1, "manasa");
		upsmt.setString(2, "assisstant");
		//upsmt.setString(1,"30000");
		int rows=upsmt.executeUpdate();
		//retrive the data from resultset.

		System.out.println(rows+"row(s) are updated.");
		Statement stmt =(Statement) con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from emp");


		System.out.println("empno\tename\tsal\tdept");
		while(rs.next()) {
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));

		}
		con.close();

		} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		}

}
