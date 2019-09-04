package com.wp.JDBCDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertionDemo extends ConnectionDemo {
	public static void main(String[] args)  {
		System.out.println("Please Enter employee details: ");
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Employee Name");
	    String ename=sc.next();
	    System.out.println("Enter Employee salary");
	    int sal=sc.nextInt();
	    System.out.println("Enter Employee Department");
	    String dept=sc.next();
	    System.out.println("Enter Employee Designation");
	    String desig=sc.next();
		Connection con=ConnectionDemo.Conndemo();
		 String qr="insert into employee(Ename,Salary,Department,Designation) Values('"+ename+"','"+sal+"','"+dept+"','"+desig+"')";
		
		try {
			PreparedStatement ps = con.prepareStatement(qr);
			ps.executeUpdate();
			System.out.println("Inserted successfully........");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    
        
		

	}

}
