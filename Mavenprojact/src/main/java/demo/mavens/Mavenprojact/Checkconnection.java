package demo.mavens.Mavenprojact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Checkconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

	/*	Class.forName("com.mysql.cj.jdbc.Driver");
		String url = ("jdbc:mysql://localhost:3306/dbjava");

		Connection con;
		con = DriverManager.getConnection(url, "root", "manager");
		System.out.println("mysql connection is sucessfully"); */
		// Statement st;
		// st=con.createStatement();
		// String q=("create table emp(id int primary key, Name varchar(20)not null,city
		// varchar(20)not null)");
		// int res= st.executeUpdate(q);
		PreparedStatement state;
	/*	state = con.prepareStatement("insert into emp values(?,?,?)");
		state.setInt(1, 10);
		state.setString(2, "Varad");
		state.setString(3, "mumbai");
		state.executeUpdate();
		System.out.println("Data is inserted sucessfully"); */
		String query="update emp set"
		
		/*state=con.prepareStatement("select*from emp");
		ResultSet res=state.executeQuery();
		
		
		while(res.next()) {
			System.out.println("id: "+res.getInt(1)+",  "+"Name: "+res.getString(2)
			+",  "+"City: "+res.getString(3));
		}*/

		// String q= ("inset into student values(1,'varad','12')");
		// String q = ("select*from orders order by oname desc limit 2");
		// String q2 = ("update orders set oname='xyz' where oid=1");
		// int result2 = st.executeUpdate(q2);
		// String q2 = ("alter table orders rename column oname to Name");
		// st.executeUpdate(q2);

		// String q2=("alter table orders drop column ordernumber");
		// st.executeUpdate(q2);

		// String q2=("alter table orders add column dob date");
		// st.executeUpdate(q2);

		// String q2=("update orders set dob='2000-04-22' where oid=1");
		// st.executeUpdate(q2);

		/*
		 * String q = ("select timestampdiff(year,'2000-04-22','2024-11-15') ");
		 * ResultSet result = st.executeQuery(q);
		 * 
		 * while (result.next()) {
		 * System.out.println("difference year: "+result.getInt(1)); }
		 */

		// String q=("insert into student values('1','ashwani','10')");
		// st.executeUpdate(q);
		/*
		 * String query=("select*from student"); ResultSet
		 * result=st.executeQuery(query); while (result.next()) {
		 * System.out.println("id: "+result.getInt(1)+", "+"Name: "+result.getString(2)
		 * +",  "+"Roll_no: "+result.getInt(3));
		 * 
		 * }
		 */
		// String q=("create table varad(id int primary key, Name varchar(20)not
		// null,city varchar(20)not null)");
		// st.executeUpdate(q);
	}
}
