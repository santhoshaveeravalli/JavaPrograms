package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectionPrgm {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/sampledb";
	String username="root";
	String password="root";
	Connection con=DriverManager.getConnection(url,username,password);
	
	if(con!=null)
		System.out.println("Connection Established");
	PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");
	ps.setInt(1, 1077);
	ps.setString(2, "Sai");
	ps.setInt(3, 450000);
	ps.setInt(4,23);
	int x = ps.executeUpdate();
	if(x!=0)
		System.out.println("Record Inserted");
/*	Statement st = con.createStatement();
    String insertquery="insert into employee values(1020,'santh',200200,26)";
	int x = st.executeUpdate(insertquery);
	if(x==1)
		System.out.println("Records Inserted");
	String delquery="delete from employee where empsalary=110200";
	int z = st.executeUpdate(delquery);
	String updatequery = "update employee set empsalary=empsalary+5000";
	int y = st.executeUpdate(updatequery);
	if(y==1)
		System.out.println("Salary Column Updated");
	con.close();*/
	/*ResultSet rs = st.executeQuery("Select * from employee");
	while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt("empsalary")+ " "+rs.getInt("age"));
*/
	}
	}

