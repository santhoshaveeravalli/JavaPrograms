import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/";
	String username = "root";
	String password = "root";
	Connection con = DriverManager.getConnection(url,username,password);
	if(con!=null)
	{
		System.out.println("Successfully Connection Established...");
	}
	Statement st = con.createStatement();
	//Drop Database
		String dropdbquery="DROP DATABASE ASSIGNMENT6";
		int dropdb = st.executeUpdate(dropdbquery);
		System.out.println("Database Dropped Successfully");
	//Database Creation
		System.out.println("Creating Database...");
		String createdbquery = "CREATE DATABASE ASSIGNMENT6";
		int createdb = st.executeUpdate(createdbquery);
		System.out.println("Assignment6 Database Created");
    //Change Database
		String usedbquery = "USE ASSIGNMENT6";
		int usedb = st.executeUpdate(usedbquery);
		System.out.println("Database Changed to Assignment6");
	//Table Creation id ,first name, lastname , mobile,address, department
		String createtbquery = "CREATE TABLE EMPLOYEE (ID INT(4) PRIMARY KEY, FNAME VARCHAR(10), LNAME VARCHAR(10),MOBILENO INT(10),LOCATION VARCHAR(15),DEPARTMENT VARCHAR(10))";
		int createtb = st.executeUpdate(createtbquery);
		System.out.println("Employee Table Created");
	// Records Insertion
		System.out.println("Inserting Records...");
		String insertrecquery =" INSERT INTO EMPLOYEE VALUES(?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(insertrecquery);
		int insertrec = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of records:");
		int n = sc.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	    	System.out.println("Enter Id:");
	    	int id = sc.nextInt();
	    	System.out.println("Enter First Name:");
	    	String fname = sc.next();
	    	System.out.println("Enter Last Name:");
	    	String lname = sc.next();
	    	System.out.println("Enter Mobile No:");
	    	int mobile = sc.nextInt();
	    	System.out.println("Enter Location:");
	    	String location = sc.next();
	    	System.out.println("Enter Department:");
	    	String department = sc.next();
	    	ps.setInt(1,id);
	    	ps.setString(2,fname);
	    	ps.setString(3,lname);
	    	ps.setInt(4,mobile);
	    	ps.setString(5,location);
	    	ps.setString(6,department);
	    	insertrec= ps.executeUpdate();
	    }
			if(insertrec>0) 
			{
				System.out.println("Records Inserted Successfully");		
			}
	   //Display Records
		    ResultSet rs = st.executeQuery("\nSELECT * FROM EMPLOYEE\n");
			while(rs.next()) 
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt("mobileno")+ "\t"+rs.getString("location")+"\t"+rs.getString(6));
			}
		//Delete Record
		    System.out.println("Enter Employee Id To Delete Record:");
		    int empid = sc.nextInt();
			int deleterec = 0;
			String deleterecquery = "DELETE FROM EMPLOYEE WHERE ID=?";
			PreparedStatement pst = con.prepareStatement(deleterecquery);
			pst.setInt(1,empid);
			deleterec = pst.executeUpdate();
			if(deleterec>0)
				System.out.println("Record Delete Successfully");	
		//Update Record 
			 System.out.println("Enter Employee Id To Update Record:");
			 int eid = sc.nextInt();
			 System.out.println("Enter Employee Location To Update Record:");
			 String loc = sc.next();
			 int updaterec = 0;
			 String updaterecquery = "UPDATE EMPLOYEE SET LOCATION=? WHERE ID=?";
			 PreparedStatement pstmt = con.prepareStatement(updaterecquery);
			 pstmt.setString(1, loc);
			 pstmt.setInt(2,eid);
			 updaterec = pstmt.executeUpdate();
			 if(updaterec>0)
					System.out.println("Record Updated Successfully");	
   			con.close();
			
	}

}
