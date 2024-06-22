package demo.mavens.Mavenprojact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class Check1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = ("jdbc:mysql://localhost:3306/java");

		Connection con;
		con = DriverManager.getConnection(url, "root", "manager");
		System.out.println("mysql connection is sucessfully");
		java.sql.CallableStatement st;
		String q="select*from student order by name asc";
		st=con.prepareCall(q);
		ResultSet res=st.executeQuery();
		
		while(res.next()) {
			System.out.println("id: "+res.getInt(1)+",  "+"name: "+res.getString(2)
			+",  "+"city: "+res.getString(3));
		}

	}

}
