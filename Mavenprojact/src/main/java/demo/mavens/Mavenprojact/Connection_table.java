package demo.mavens.Mavenprojact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Connection_table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = ("jdbc:mysql://localhost:3306/java");

		Connection con;
		con = DriverManager.getConnection(url, "root", "manager");
		System.out.println("mysql connection is sucessfully");
		/*
		 * String query =
		 * "create table student(id int(10) primary key, name varchar(22) not null,city varchar(35) not null)"
		 * ; st = con.prepareStatement(query); st.executeUpdate();
		 * System.out.println("create table student sucess ");
		 */
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("Add data choice 1");
			System.out.println("show data choice 2");
			System.out.println("update data choice 3");
			System.out.println("delete data choice 4");
			System.out.println("record count is choice 5");
			System.out.println("exit Application choice 6");

			System.out.println();
			System.out.println("Please enter your choice");
			int choice = sc.nextInt();
			PreparedStatement st;
			int id;
			String name;
			String city;

			switch (choice) {

			case 1:
				System.out.println();
				String q1 = "insert into student values(?,?,?)";
				st = con.prepareStatement(q1);
				System.out.println("please enter id");
				id = sc.nextInt();
				System.out.println("please enter Name");
				name = sc.next();
				System.out.println("please enter city");
				city = sc.next();

				st.setInt(1, id);
				st.setString(2, name);
				st.setString(3, city);
				st.executeUpdate();
				System.out.println("data is inserted is sucessfully");

				break;

			case 2:
				System.out.println();
				String q2 = "select*from student order by name desc";
				st = con.prepareStatement(q2);
				ResultSet res = st.executeQuery();

				while (res.next()) {
					System.out.println("id: " + res.getInt(1) + ",  " + "Name: " + res.getString(2) + ",  " + "city: "
							+ res.getString(3));
				}
				System.out.println("record show is sucessfully");
				break;

			case 3:
				System.out.println();
				String q3 = "update student set name=?, city=? where id=?";
				st = con.prepareStatement(q3);

				System.out.println("please enter id");
				id = sc.nextInt();
				System.out.println("please enter Name");
				name = sc.next();
				System.out.println("please enter city");
				city = sc.next();

				st.setString(1, name);
				st.setString(2, city);
				st.setInt(3, id);

				st.executeUpdate();
				System.out.println("data is updated sucessfully");

				break;

			case 4:
				System.out.println();
				String q4 = "delete from student where id=?";
				st = con.prepareStatement(q4);

				System.out.println("please enter id");
				id = sc.nextInt();

				st.setInt(1, id);

				st.executeUpdate();
				System.out.println("data delete is sucessfully");

				break;
				
			case 5:
				System.out.println();
				String q5="select count(*) from student";
				st=con.prepareStatement(q5);
				ResultSet result=st.executeQuery();
				
				while(result.next()) {
					System.out.println("record Count is: "+result.getInt(1));
				}
				System.out.println("Show record count is sucessfully");
				
				break;

			case 6:
				System.out.println();
				System.out.println("shut Down System...!  ");
				System.exit(0);

				break;

			default:
				System.out.println();
				System.out.println("Invalid choice...!  ");

				break;

			}
		} while (true);

	}

}
